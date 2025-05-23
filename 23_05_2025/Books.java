public class Books {
    public static void main(String[] args) {
        int [] arr={2,1,6,4,2,3,1,1,4,2,6,7,3};
        /* Brut Force Method
        int ans=0;
        for(int i=0;i<=arr.length-5;i++){
            int dis=0;
            for(int j=i;j<i+5;j++){
                dis+=arr[j];
            }
            // System.out.println(dis);
            ans=Math.max(ans,dis);
        } */
        int psum=0,i,msum=0;
        for(i=0;i<5;i++){
            psum+=arr[i];
        }
        msum=Math.max(msum,psum);
        for(i=5;i<arr.length;i++){
            psum=psum+arr[i]-arr[i-5];
            msum=Math.max(msum,psum);
        }
        System.out.println(msum);
    }
}