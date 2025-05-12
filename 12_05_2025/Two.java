import java.util.*;
public class Two {
    public static void removeDup( ArrayList<Integer> list){
        HashSet<Integer> set=new HashSet<>();
        //TC= O(n), SC=O(n) 
        for(int ele: list){
            if(set.contains(ele)){
                continue;
            }
            else{
                set.add(ele);
                System.out.println(ele);
            }
        }
    }
    public static void main(String [] args){
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(8,2,3,4,3,3,4,5,6,7,9,2,4));
        removeDup(list);
    }
}
