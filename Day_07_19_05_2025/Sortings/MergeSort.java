package Sortings;
import java.util.*;
public class MergeSort {
    public static void merge(int [] arr,int s,int m,int e) {
        int [] temp=new int[e-s+1];
        int i=s,j=m+1;
        int k=0;
        while(i<=m && j<=e){
            if(arr[i]<arr[j]){
                temp[k++]=arr[i++];
            }
            else{
                temp[k++]=arr[j++];
            }
        }
        while(i<=m){
                temp[k++]=arr[i++];
            }
        while(j<=e){
            temp[k++]=arr[j++];
            }
        for(i=0;i<temp.length;i++){
            arr[s+i]=temp[i];
        }
        
    }
    private static void mergerSort(int []arr,int s,int e){
        if(s>=e){
            return ;
        }
        int mid=s+(e-s)/2;
        mergerSort(arr, s, mid);
        mergerSort(arr, mid+1, e);
        merge(arr,s,mid,e);
    }
    public static void main(String[] args) throws Exception {
        int []arr= {5,3,1,7,2};
        System.out.println(Arrays.toString(arr));
        mergerSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
