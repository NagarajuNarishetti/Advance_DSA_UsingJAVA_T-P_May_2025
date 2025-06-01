import java.util.*;
public class Prims {
     public static void prims(int start, Map<Integer, List<int[]>> graph) {
        Set<Integer> visited = new HashSet<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        List<int[]> mstEdges = new ArrayList<>();
        int totalCost = 0;

        // [weight, current_node, parent_node]
        pq.offer(new int[]{0, start, -1});

        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int weight = curr[0], node = curr[1], parent = curr[2];

            if (visited.contains(node)) continue;
            visited.add(node);

            if (parent != -1) {
                mstEdges.add(new int[]{parent, node, weight});
            }

            totalCost += weight;

            for (int[] neighbor : graph.getOrDefault(node, new ArrayList<>())) {
                int nextNode = neighbor[0];
                int nextWeight = neighbor[1];

                if (!visited.contains(nextNode)) {
                    pq.offer(new int[]{nextWeight, nextNode, node});
                }
            }
        }

        System.out.println("Total cost of MST: " + totalCost);
        System.out.println("Edges in MST:");
        for (int[] edge : mstEdges) {
            System.out.println(edge[0] + " - " + edge[1] + " : " + edge[2]);
        }
    }

    public static void main(String[] args) {
        int[][] edges = {
            {10, 5, 2},
            {10, 7, 4},
            {5, 7, 1},
            {5, 8, 3},
            {7, 8, 1},
            {5, 3, 2},
            {8, 3, 1},
            {8, 9, 2}
        };

        Map<Integer, List<int[]>> graph = new HashMap<>();

        // Build adjacency list using computeIfAbsent
        for (int[] edge : edges) {
            int u = edge[0], v = edge[1], w = edge[2];
            graph.computeIfAbsent(u, k -> new ArrayList<>()).add(new int[]{v, w});
            graph.computeIfAbsent(v, k -> new ArrayList<>()).add(new int[]{u, w});
        }

        System.out.println("Graph:");
        for (var entry : graph.entrySet()) {
            System.out.print(entry.getKey() + " -> ");
            for (int[] pair : entry.getValue()) {
                System.out.print("[" + pair[0] + "," + pair[1] + "] ");
            }
            System.out.println();
        }

        // Run Prim's algorithm starting from node 10
        prims(10, graph);
    }
}
