import java.util.*;
public class Cards {
   public static void main(String[] args) {
    int [] arr={4,2,7,20,8,6,8,1}; 
    int k=3, lsum=0, rsum=0 ,msum=0;
    for(int i=0;i<k;i++){
        lsum+=arr[i];
    }
    int l=k-1,r=arr.length-1;
    msum=Math.max(msum,lsum);
    while(l>=0 ){
        lsum-=arr[l];
        rsum+=arr[r];
        r--;
        l--;
        msum=Math.max(msum,rsum+lsum);
    }
    System.out.println(msum);
   }
}