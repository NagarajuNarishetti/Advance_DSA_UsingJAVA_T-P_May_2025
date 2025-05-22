import java.util.*;
public class TwoSum {
    public static void main(String[] args) throws Exception {
        int[] arr={2,7,11,15};
        int t=22;
        int i=0,j=arr.length-1;
        while(i<arr.length-1 && j>=0){
            if(arr[i]+arr[j]==t){
                System.out.println(i+" "+j);
                break;
            }
            else if(arr[i]+arr[j]>t){
                j--;
            }
            else{
                i++;
            }
        }
        
    }
}
