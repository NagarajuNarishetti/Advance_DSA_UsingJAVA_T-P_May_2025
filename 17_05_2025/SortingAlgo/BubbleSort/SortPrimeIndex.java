import java.util.*;
public class SortPrimeIndex {
    private static boolean isPrime(int n){
         boolean isPrime=true;
         for(int i=2;i*i<=n;i++){
            if(n%i==0){
                isPrime=false;
                break;
            }
        }
        return isPrime;
    }
   private static int getPrimes(ArrayList<Integer> arr){
    int ans=-1;
        for(int i=0;i<arr.size();i++){
            if(isPrime(arr.get(i))){
                ans=i;
                break;
            }
        }
        return arr.get(ans);
   }
   private static void swapPrimes(int [] arr,int i,int j){
    int temp=arr[i];
     arr[i]=arr[j];
     arr[j]=temp;
   }
   private static void swapList(ArrayList<ArrayList<Integer>> list,int i,int j){
    ArrayList<Integer> temp= list.get(i);
    list.set(i,list.get(j));
    list.set(j,temp);
   }
   public static void main(String[] args) throws Exception {
    ArrayList<ArrayList<Integer>> list= new ArrayList<>();
    list.add(new ArrayList<>(Arrays.asList(4,13,12)));
    list.add(new ArrayList<>(Arrays.asList(8,10,5)));
    list.add(new ArrayList<>(Arrays.asList(7,9,20)));
    list.add(new ArrayList<>(Arrays.asList(14,8,3)));
    int [] primes= new int[list.size()];
    for(int i=0;i<list.size();i++){
        primes[i]=getPrimes(list.get(i));
    }
     System.out.println(list);
     System.out.println(Arrays.toString(primes));
     for(int i=0;i<primes.length;i++){
        boolean isSorted=true;
        for(int j=0;j<primes.length-1-i;j++){
            if(primes[j]>primes[j+1]){
                swapList(list,j,j+1);
                swapPrimes(primes,j,j+1);
                isSorted=false;
            }
        }
        if(isSorted){
            break;
        }
     }
    System.out.println(list);
    System.out.println(Arrays.toString(primes));
   } 
}