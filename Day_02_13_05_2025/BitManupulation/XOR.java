import java.util.*;
public class XOR {
    public static void main(String[] args) throws Exception {
    Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans1=0;
        for(int i=1;i<=n;i++){
            ans1^=i;
        }
        System.out.println(ans1);
        int ans2=0;
        if(n%4==1){
            ans2=1;
        }
        else if(n%4==2){
            ans2=n+1;
        }
        else if(n%4==3){
            ans2=0;
        }
        else{
            ans2=n;
        }
        System.out.println("ans using O(n) = " +ans1+" using O(1) = "+ans2);
    }
}
