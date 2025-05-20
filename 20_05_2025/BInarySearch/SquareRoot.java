public class SquareRoot {
    private static int rootFloor(int n){
        int s=0,e=n/2;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(mid*mid==n){
                return mid;
            }
            else if(mid*mid>n){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
       return e;
    }
    private static int rootSeal(int n){
        int s=0,e=n/2;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(mid*mid==n){
                return mid;
            }
            else if(mid*mid>n){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
       return s;
        
    }
    public static void main(String[] args) throws Exception {
        int n=0;
        System.out.println("Floor = " + rootFloor(n));
        System.out.println("seal  = " + rootSeal(n));
    }
}
