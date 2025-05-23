import java.util.*;
public class Possible {
    public static boolean isPossible(int n,int p,int q){
        if(n==1){
            return true;
        }
        if(n<1){
            return false;
        }
        return isPossible(n-p,p, q) || isPossible(n-q ,p, q);
    }

    public static int minIsPossibleCount(int n,int p,int q){
        if(n==1){
            return 1;
        }
        if(n<4){
            return 0;
        }
        return Math.min(minIsPossibleCount(n-p,p, q),minIsPossibleCount(n-q ,p, q))+1;
        // int a=minIsPossibleCount(n-p,p, q);
        // int b=minIsPossibleCount(n-q ,p, q);
        // return Math.min(a,b)==0 ? 0 : Math.min(a,b)+1;

    }
    public static ArrayList<Integer> bfs(int n,int p,int q){
        ArrayList<Integer> list= new ArrayList<>();
        Queue<ArrayList<Integer>> queue = new LinkedList<>();
        Set<Integer> v = new HashSet<>();
        
        queue.add(n);
        while(!queue.isEmpty()){
            int temp= queue.poll();
            if(temp==1){
                return list;
            }
            if(temp){
                list.add(temp);
                queue.add(n-3);
                queue.add(n-5);
            }
            
        }
        return list;
    }
    public static void main(String[] args) throws Exception {
        int n=20;
        int p=3;
        int q=5;
        System.out.println(isPossible(n,p,q));
        System.out.println(minIsPossibleCount(n,p,q));

        
    }
}
