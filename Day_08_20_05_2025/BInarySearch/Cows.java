import java.util.*;
public class Cows {
    // Wrong Code for Agressive Cows
    public static void main(String[] args) throws Exception {
        int arr[]={2, 12, 11, 3, };
        Arrays.sort(arr);
        int k=5;
        int s=0,e=arr.length-1;
        int smax=0,smin=0;
        while(s<e){
            int mid=s+(e-s)/2;
            if(k>1){
                System.out.println(s);
                System.out.println(e);
                k-=2;
                smax=Math.max(smax,s);
                smin=Math.min(smin,e);
            }
            else {
                System.out.println(mid);
                k--;
            }
            s=(s+mid)/2;
            e=(e+mid)/2;
        }
        System.out.println("Ans = "+ (smax-smin));
        System.out.println(Arrays.toString(arr));

    }
}
