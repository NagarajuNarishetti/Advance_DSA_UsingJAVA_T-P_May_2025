public class CountOfPrimeNumbers  {
    public static int countisPrime(int [] arr,int n ,int i,int c){
        if(n==arr.length){
            return c;
        }
        if(i*i>arr[n]){
            return countisPrime(arr, n+1, 2, c+1);
        }
        if(arr[n]%i==0){
            return countisPrime(arr, n+1, 2, c);
        }
        return countisPrime(arr,n, i+1,c) ;
    }
    public static void main(String[] args) throws Exception {
        int [] arr= {13,17,21,23,7,29,3,6,9,10,12};
        System.out.println(countisPrime(arr,0,2,0));
    }    
}

