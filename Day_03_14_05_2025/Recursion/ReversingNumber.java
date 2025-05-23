
public class ReversingNumber {
    public static int rev(int n){
        return helper(n,0);
    }
    public static int helper(int n,int rev){
        if(n==0){
            return rev;
        }
        return helper(n/10,rev *10 + n%10);
    }
    public static void main(String[] args) throws Exception {
        int n=1234;
        System.out.println(rev(n));
    }
}
