import java.util.*;
public class TwoPower {
    public static void main(String[] args) throws Exception {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    if((n&(n-1))==0){
        System.out.println("True");
    }
    else{
        System.out.println("False");
    }    
    }
}
