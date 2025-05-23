import java.util.*;
public class XOR2 {
    public static int xor(int n){
        int ans=0;
        if(n%4==1){
            ans=1;
        }
        else if(n%4==2){
            ans=n+1;
        }
        else if(n%4==3){
            ans=0;
        }
        else{
            ans=n;
        }
        return ans;
    }
    public static void main(String[] args) throws Exception {
    Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int ans1=0;
        for(int i=n;i<=m;i++){
            ans1^=i;
        }
        System.out.println("ans using O(n) = " + ans1);
        System.out.println("ans using O(1) = " + (xor(n-1)^xor(m)));
        sc.close();
    }
}
