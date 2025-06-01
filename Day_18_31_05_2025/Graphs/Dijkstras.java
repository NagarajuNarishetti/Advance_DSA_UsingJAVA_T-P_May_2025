import java.util.*;
public class Dijkstras {public static void sssp(int u, int v, Map<Integer, List<int[]>> graph) {
        Map<Integer, Integer> dist = new HashMap<>();
        Map<Integer, Integer> sp = new HashMap<>();
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> q = new LinkedList<>();

        for (int node : graph.keySet()) {
            dist.put(node, Integer.MAX_VALUE);
        }

        dist.put(u, 0);
        sp.put(u, u);
        q.add(u);

        while (!q.isEmpty()) {
            int n = q.poll();
            visited.add(n);

            for (int[] edge : graph.get(n)) {
                int i = edge[0];
                int w = edge[1];

                if (dist.get(n) + w < dist.getOrDefault(i, Integer.MAX_VALUE)) {
                    dist.put(i, dist.get(n) + w);
                    sp.put(i, n);
                }

                if (!q.contains(i) && !visited.contains(i)) {
                    q.add(i);
                }
            }
        }

        System.out.println("Distances from source " + u + ": " + dist);

        // Print path from u to v
        List<Integer> path = new ArrayList<>();
        path.add(v);
        while (sp.get(v) != v) {
            v = sp.get(v);
            path.add(v);
        }
        Collections.reverse(path);
        System.out.println("Shortest path: " + path);
    }

    public static void main(String[] args) {
        int[][] edges = {
            {10, 5, 2},
            {10, 7, 4},
            {5, 7, 1},
            {5, 8, 3},
            {7, 8, 1},
            {5, 3, 2},
            {8, 3, 1}
        };

        Map<Integer, List<int[]>> graph = new HashMap<>();

        for (int[] edge : edges) {
            int u = edge[0], v = edge[1], w = edge[2];
            // Using computeIfAbsent for cleaner initialization
            graph.computeIfAbsent(u, k -> new ArrayList<>()).add(new int[]{v, w});
            graph.computeIfAbsent(v, k -> new ArrayList<>()).add(new int[]{u, w});
        }

        // Print adjacency list
        System.out.println("Graph adjacency list:");
        for (int key : graph.keySet()) {
            System.out.print(key + " -> ");
            for (int[] pair : graph.get(key)) {
                System.out.print("[" + pair[0] + "," + pair[1] + "] ");
            }
            System.out.println();
        }

        // Run SSSP from 10 to 8
        sssp(10, 8, graph);
    }
}
