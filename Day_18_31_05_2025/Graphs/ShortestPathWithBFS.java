import java.util.*;

public class Main {

    public static void main(String[] args) {
        // Initialize graph
        Map<Integer, List<int[]>> graph = new HashMap<>();
        int[][] edges = {
            {10, 5, 2},
            {10, 7, 4},
            {5, 7, 1},
            {5, 8, 3},
            {5, 3, 2},
            {8, 3, 1},
            {8, 7, 1}
        };

        // Build graph using computeIfAbsent
        for (int[] edge : edges) {
            int u = edge[0], v = edge[1], w = edge[2];
            graph.computeIfAbsent(u, k -> new ArrayList<>()).add(new int[]{v, w});
            graph.computeIfAbsent(v, k -> new ArrayList<>()).add(new int[]{u, w});
        }

        System.out.println("Graph:");
        for (var entry : graph.entrySet()) {
            System.out.print(entry.getKey() + " -> ");
            for (int[] neighbor : entry.getValue()) {
                System.out.print("[" + neighbor[0] + "," + neighbor[1] + "] ");
            }
            System.out.println();
        }

        int start = 10, dest = 3;

        // Distance dictionary
        Map<Integer, Integer> dist = new HashMap<>();
        for (int node : graph.keySet()) {
            dist.put(node, node == start ? 0 : Integer.MAX_VALUE);
        }

        System.out.println("Initial distances: " + dist);

        // Parent list
        Map<Integer, Integer> parent = new HashMap<>();
        for (int node : graph.keySet()) {
            parent.put(node, -1);
        }

        // Visited set and BFS queue
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        visited.add(start);

        while (!queue.isEmpty()) {
            int curr = queue.poll();
            for (int[] neighbor : graph.getOrDefault(curr, new ArrayList<>())) {
                int nextNode = neighbor[0];
                int weight = neighbor[1];

                if (!visited.contains(nextNode)) {
                    queue.offer(nextNode);
                    visited.add(nextNode);
                }

                if (dist.get(curr) + weight < dist.get(nextNode)) {
                    dist.put(nextNode, dist.get(curr) + weight);
                    parent.put(nextNode, curr);
                }
            }
        }

        System.out.println("Final distances: " + dist);
        System.out.println("Parent map: " + parent);

        // Reconstruct path
        List<Integer> path = new ArrayList<>();
        int current = dest;
        while (current != -1) {
            path.add(current);
            current = parent.get(current);
        }
        Collections.reverse(path);
        System.out.println("Shortest path from " + start + " to " + dest + ": " + path);
    }
}
