
public class KokoBananas {
    private static boolean isPossible(int []arr,int k,int h){
        int s=0;
        for(int i=0;i<arr.length;i++){
            s+=(int)Math.ceil((double)arr[i]/k);
            if(s>h){
                return false;
            }
        }
        return true;
    }
    private static int max(int []arr){
        int m=arr[0];
        for(int ele:arr){
            if(ele>m){
                m=ele;
            }
        }
        return m;
    }
    private static int minK(int[]arr,int h){
        int s=1,e=max(arr);
        int ans=0;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(isPossible(arr, mid, h)){
                ans=mid;
                e=mid-1;
            }
            else{
                s=mid+1;
            }

        }
        return ans;       
    }
    public static void main(String[] args) throws Exception {
        int [] arr = {30,11,23,4,20};
        int h=5;
        // System.out.println(isPossible(arr,k,h));
        System.out.println(minK(arr,h));
    }
}
