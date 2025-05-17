package BubbleSort;
import java.util.Arrays;

public class KthLargest {
        public static void main(String[] args) throws Exception {
        int [] arr= {6,3,4,2,9,1,5};
        int k=2;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
        }
    }
    System.out.println(Arrays.toString(arr));
    System.out.println(arr[arr.length-k]);

 }
}
