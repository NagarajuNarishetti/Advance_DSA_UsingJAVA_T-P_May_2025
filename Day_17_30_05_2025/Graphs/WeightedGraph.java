import java.util.*;

public class WeightedGraph {
    private static void printAll(int u,int v,ArrayList<Integer> path,int cost){
        path.add(u);
        if(u==v){
            System.out.println(path +" "+cost);
            return;
        }
        for (List<Integer> neighbor : map.getOrDefault(u, new ArrayList<>())) {
        int next = neighbor.get(0);
        if (!path.contains(next)) {  // Avoid revisiting
            cost+=neighbor.get(1);
            printAll(next, v, new ArrayList<>(path),cost);
            cost-=neighbor.get(1);
        }
    }

    }
    private static HashMap<Integer,List<List<Integer>>> map= new HashMap<>();
    public static void main(String[] args) {
        int [][] edges= {
            {5, 2,3}, {5, 7,2}, {5, 8,1}, {2, 7,2},
            {2, 8,4}, {2, 3,2}, {8, 7,1}, {8, 3,3}
        };
        for(int [] edge: edges){
            int u=edge[0],v=edge[1],w=edge[2];
            map.computeIfAbsent(u,k-> new ArrayList<>()).add(Arrays.asList(v,w));
            map.computeIfAbsent(v,k-> new ArrayList<>()).add(Arrays.asList(u,w));
        }
        // System.out.println(map);
        printAll(5, 3, new ArrayList<>(),0);

    }
}
