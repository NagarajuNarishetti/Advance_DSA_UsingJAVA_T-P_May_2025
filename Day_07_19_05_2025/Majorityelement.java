import java.util.*;
public class Majorityelement {
    public static void main(String[] args) throws Exception {
    HashMap<Integer,Integer> map= new HashMap<>();
    int [] arr={ 2,1,1,2,3,1,1,};
    for(int ele : arr){
        map.put(ele,map.getOrDefault(ele,0 )+1);
        if(map.get(ele)>arr.length/2){
            System.out.println(ele);
            break;
        }
     }
    }
}
