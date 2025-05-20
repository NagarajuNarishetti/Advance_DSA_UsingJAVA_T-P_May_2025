
public class PeekElement {
    private static int peek(int []arr){
        int n=arr.length;
        int s=0,e=n-1;
        while(s<e){
            int mid=s+(e-s)/2;
            if(arr[mid]>arr[mid+1]){
                e=mid;
            }
            else{
                s=mid+1;
            }
        }
        return arr[s];
    }
    public static void main(String[] args) throws Exception {
        int [] arr={2,4,5,8,7,4,3,5,10,11,5,2};
        // int [] arr={8,2};
        //    int [] arr={2,8};
        System.out.println("Peek is = "+peek(arr));
        
    }
}