import java.util.*;

public class Graphs {

    // Build the graph from edges
    public static Map<Integer, List<Integer>> buildGraph(int[][] edges) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int[] edge : edges) {
            int u = edge[0], v = edge[1];
            graph.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
            graph.computeIfAbsent(v, k -> new ArrayList<>()).add(u); // undirected
        }
        return graph;
    }

    // DFS to find and print all paths from start to end
    public static void findAllPaths(Map<Integer, List<Integer>> graph, int start, int end,
                                    List<Integer> path, Set<Integer> visited) {
        path.add(start);
        visited.add(start);

        if (start == end) {
            System.out.println(path);
        } else {
            for (int neighbor : graph.getOrDefault(start, new ArrayList<>())) {
                if (!visited.contains(neighbor)) {
                    findAllPaths(graph, neighbor, end, path, visited);
                }
            }
        }

        path.remove(path.size() - 1); // backtrack
        visited.remove(start);
    }

    // Count all paths from start to end
    public static int countPaths(Map<Integer, List<Integer>> graph, int start, int end,
                                 Set<Integer> visited) {
        if (start == end) {
            return 1;
        }

        visited.add(start);
        int count = 0;

        for (int neighbor : graph.getOrDefault(start, new ArrayList<>())) {
            if (!visited.contains(neighbor)) {
                count += countPaths(graph, neighbor, end, visited);
            }
        }

        visited.remove(start); // backtrack
        return count;
    }

    // DFS to print lengths of all paths from start to end
    public static void printPathLengths(Map<Integer, List<Integer>> graph, int start, int end,
                                        List<Integer> path, Set<Integer> visited) {
        path.add(start);
        visited.add(start);

        if (start == end) {
            int length = path.size() - 1; // number of edges
            System.out.println("Path: " + path + " -> Length: " + length);
        } else {
            for (int neighbor : graph.getOrDefault(start, new ArrayList<>())) {
                if (!visited.contains(neighbor)) {
                    printPathLengths(graph, neighbor, end, path, visited);
                }
            }
        }
        path.remove(path.size() - 1); // backtrack
        visited.remove(start);
    }

    // ✅ New Method: BFS Traversal from a given node
    public static void bfsTraversal(Map<Integer, List<Integer>> graph, int start) {
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();

        visited.add(start);
        queue.add(start);

        System.out.println("BFS traversal from node " + start + ":");

        while (!queue.isEmpty()) {
            int current = queue.poll();
            System.out.print(current + " ");

            for (int neighbor : graph.getOrDefault(current, new ArrayList<>())) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }

        System.out.println(); // newline
    }

    public static void main(String[] args) {
        int[][] edges = {
            {5, 2}, {5, 7}, {5, 8}, {2, 7},
            {2, 8}, {2, 3}, {8, 7}, {8, 3}
        };

        int start = 5;
        int end = 3;

        Map<Integer, List<Integer>> graph = buildGraph(edges);

        List<Integer> path = new ArrayList<>();
        Set<Integer> visited = new HashSet<>();

        System.out.println("All paths from " + start + " to " + end + ":");
        findAllPaths(graph, start, end, path, visited);

        int pathCount = countPaths(graph, start, end, new HashSet<>());
        System.out.println("Total number of paths from " + start + " to " + end + ": " + pathCount);

        System.out.println("Lengths of all paths:");
        printPathLengths(graph, start, end, new ArrayList<>(), new HashSet<>());
        // ✅ Call BFS
        bfsTraversal(graph, start);
    }
}
