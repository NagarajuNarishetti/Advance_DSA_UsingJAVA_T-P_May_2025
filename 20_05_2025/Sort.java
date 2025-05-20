import java.util.*;

public class Sort{
    public static void main(String[] args) {
        Integer [] arr1= {2,3,2,5,1,6,3,8,7,2,3};
        Integer [] arr2= {3,1,5,2};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr2.length;i++){
            map.put(arr2[i],i);
        }
        Arrays.sort(arr1,(a,b)->{
            if(map.containsKey(a) && map.containsKey(b)){
                return map.get(a)-map.get(b);
            }
            if(map.containsKey(a)){
                return -1;
            }
            if(map.containsKey(b)){
                return 1;
            }
                return a-b;
        });
        System.out.println(Arrays.toString(arr1));
    }
}