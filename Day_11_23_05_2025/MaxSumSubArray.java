
public class MaxSumSubArray {
    public static void main(String[] args) {
        int [] arr={2,1,6,4,2,3,1,1,4,2,6,7,3};
        /* O(n*n)
        int k=7,sum=0,c=0,ans=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            c++;
            if(sum>k){
                sum=0;
                i=i-c+2;
                c=1;
            }
            ans=Math.max(ans,c-1);
        } */
       /* O(n)
        int k = 7, sum = 0, ans = 0;
        int left = 0;
        for (int right = 0; right < arr.length; right++) {
            sum += arr[right];
            while (sum > k) {
                sum -= arr[left];
                left++;
            }
            ans = Math.max(ans, right - left + 1);
        }
        System.out.println(ans);
        */
        int k=6,sum=0,l=0,max=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum<=k){
                max=Math.max(max,i-l+1);
            }else{
                sum=sum-arr[l];
                l=l+1;
            }
        }
        System.out.println(max);
    }
}
