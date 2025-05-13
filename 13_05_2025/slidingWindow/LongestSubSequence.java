import java.util.*;
public class LongestSubSequence {
    public static void main(String[] args) throws Exception {
    Scanner sc=new Scanner(System.in);
    // int[] arr = new int[] { 2, 3, 4, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 7 , 3, 4, 5, 10, 9};
    int[] arr = new int[] {1,2,3,2,3,4,5,6,7,8,9};
    int ans=0,count=1;
    // for(int i=1;i<arr.length;i++){
    //     int j=i;
    //     count=1;
    //     while(j < arr.length && (arr[j] - arr[j - 1]) == 1){
    //         count++;
    //         j++;
    //     }
    //     ans=Math.max(count,ans);
    // }
    for(int i=1;i<arr.length;i++){
        count++;
        if(arr[i]-arr[i-1]!=1){
            count=1;
        }
        ans= Math.max(count,ans);
    }
      System.out.println(ans);  
    }
}
