public class SquareRoot{
    private  static int bsn(int n){
        int s=1,e=n/2;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(mid*mid==n){
                return mid;
            }
            else if(mid*mid<n){
                s+=1;
            }
            else{
                e-=1;
            }
        }
        return e;
    }
    public static void main(String[] args) {
        int n=50;
        System.out.println(bsn(n));
        
    }
}