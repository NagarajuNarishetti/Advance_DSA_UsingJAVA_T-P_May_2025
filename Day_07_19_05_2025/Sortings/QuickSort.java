package Sortings;
import java.util.Arrays;

public class QuickSort {
    private static void quickSort(int [] arr,int low,int high){
        if(low>=high){
            return ;
        }
        int s=low;
        int e=high;
        int mid=s+(e-s)/2;
        int pivote= arr[mid];
        while(s<=e){
            while(arr[s]<pivote){
                s++;
            }
            while(arr[e]>pivote){
                e--;
            }
            if(s<=e){
                int temp=arr[e];
                arr[e]=arr[s];
                arr[s]=temp;
                s++;
                e--;
            }

        }
        quickSort(arr, low,e);
        quickSort(arr, s,high);

        
    }
    public static void main(String[] args) throws Exception {
        int [] arr= {3,53,2,7,5,1,9,4,7,5,2,3};
        System.out.println(Arrays.toString(arr));
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
