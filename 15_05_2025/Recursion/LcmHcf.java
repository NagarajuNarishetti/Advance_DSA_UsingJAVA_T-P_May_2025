
public class LcmHcf {
    public static int gcd(int a,int b){
        if(a==0){
            return b;
        }
        return gcd(b%a,a);
    }
    public static int lcm(int a,int b){
        return a*b/gcd(a,b);

    }
    public static void main(String[] args) throws Exception {
        int a=5;
        int b=6;
        System.out.println("GCD = " +gcd(a,b));
        System.out.println("LCM = " +lcm(a,b));
    }
}
