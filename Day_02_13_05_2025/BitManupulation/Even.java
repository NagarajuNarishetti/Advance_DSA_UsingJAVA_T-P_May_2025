import java.util.*;

public class Even {
    public static void main(String[] args) throws Exception {
    Scanner sc=new Scanner(System.in);
        int n=15;
        /*
        if(((n>>1)<<1)==n){
        System.out.println("even Number");
        }
        else{
            System.out.println("Odd Number");
        }
         */
        
        if((n^1) == n+1){
            System.out.println("even Number");
        }
        else{
            System.out.println("Odd number");
        }
    }
}
