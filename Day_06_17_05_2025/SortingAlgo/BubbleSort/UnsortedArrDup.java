import java.util.*;
public class UnsortedArrDup {
    private static void swap(int [] arr,int  i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) throws Exception {
    // Scanner sc=new Scanner(System.in);
    int [] arr= {7,2,6,3,7,7,2,2,2};
    HashMap<Integer,Integer> map= new HashMap<>();
    for(int ele: arr){
        map.put(ele,map.getOrDefault(ele,0)+1);
    }       
    System.out.println(Arrays.toString(arr));
    for(int i=0;i<arr.length-1;i++){
        boolean isSorted=true;
        for(int j=0;j<arr.length-1-i;j++){
            if(map.get(arr[j])>map.get(arr[j+1])){
                swap(arr,j,j+1);
                isSorted=false;
            }
        }
        if(isSorted){
            break;
        }
    } 
    System.out.println(Arrays.toString(arr));
    }
}
