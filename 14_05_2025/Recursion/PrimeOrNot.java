
public class PrimeOrNot {
    public static boolean isPrime(int n ,int i){
        if(i*i>n){
            return true;
        }
        if(n%i==0){
            return false;
        }
        return isPrime(n, i+1) ;
    }
    public static void main(String[] args) throws Exception {
        int n=21;
        System.out.println(isPrime(n,2));
        
    }    
}
