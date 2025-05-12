import java.util.*;
public class ONE{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean isPrime=true;
        if(n<2){
            System.out.println(n+"  is Not a Prime Number");
        }
        for(int i=2;i*i<n;i++){
            if(n%i==0){
                System.out.println(n+"  is Not a Prime Number");
                isPrime=false;
                break;
            }
        }
        if(isPrime){
            if(n>200){
                System.out.println(n+ "is Prime and Greater than 200");
            }
            else{
                System.out.println(n+ "is Prime and less than 200");
            }
        }
        if(n<2){
            System.out.println(n+"  is Not a Prime Number");
        }
        if(n==2 ||n==3){
            System.out.println(n+ "is Prime and less than 200");
        }

        // for(int i=5;i*i<n;i+=2){
        //     if(n%i==0 || n%i+1==0){
        //         System.out.println(n+ "is Not Prime");
        //         break;
        //     }
        // }
    }
}