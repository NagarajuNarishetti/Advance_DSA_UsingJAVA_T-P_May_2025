import java.util.*;
public class CoinChange{
    private static int [][]dp;
    private static int minCoins(int [] arr,int n){
    if (n == 0) return 0; // no coins needed

    int sum = Arrays.stream(arr).sum();
    dp = new int[arr.length][sum + 1];

    // Base case
    dp[0][0] = 0;
    if (arr[0] <= sum)
        dp[0][arr[0]] = 1;

    int s = arr[0];
    for (int i = 1; i < arr.length; i++) {
        s += arr[i];
        for (int j = 0; j <= s; j++) {
            // Don't take arr[i]
            if (dp[i - 1][j] > 0 || j == 0) {
                dp[i][j] = dp[i - 1][j];
            }

            // Take arr[i]
            if (j >= arr[i] && dp[i - 1][j - arr[i]] > 0) {
                if (dp[i][j] == 0) {
                    dp[i][j] = dp[i - 1][j - arr[i]] + 1;
                } else {
                    dp[i][j] = Math.min(dp[i][j], dp[i - 1][j - arr[i]] + 1);
                }
            }
        }
    }

    // Debug print
    System.out.println("\nMin Coins DP Table:");
    for (int[] row : dp)
        System.out.println(Arrays.toString(row));

    return dp[arr.length - 1][n] == 0 ? -1 : dp[arr.length - 1][n];
    }
    private static boolean isPossible(int [] arr,int n){
        int sum=0;
        for(int ele:arr){
            sum+=ele;
        }
        int s=arr[0];
        dp=new int[arr.length][sum+1];
        dp[0][0]=1;
        dp[0][arr[0]]=1;
        for(int i=1;i<dp.length;i++){
            s+=arr[i];
            for(int j=0;j<=s;j++){
                if(dp[i-1][j]==1){
                    dp[i][j]=1;
                }
            }
            for(int j=arr[i];j<=s;j++){
                if(dp[i-1][j-arr[i]]==1){
                    dp[i][j]=1;
                   }
                }
        }
        System.out.println();
        for(int []row : dp){
            System.out.println(Arrays.toString(row));
        }
        if(n<dp[0].length){
            if(dp[dp.length-1][n]==1){
                return true;
            }
            else{
            return false;
            }
        }
        else{
            return false;
        }
    }
    // Might be wrong
    private static boolean isPos(int []arr,int t){
        int sum=0;
        for(int ele:arr){
            sum+=ele;
        }
        if(dp[dp.length-1][t%sum]==1){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int [] arr={2,3,4,5};
        int n=7;
        if(isPossible(arr, n)){
            System.out.println(n+" Is Possible");
        }
        else{
            System.out.println(n+" Not Possible");
        }
        // System.out.println("Min Coins to make "+n+" are "+minCoins(arr,n));
        n=19;
        System.out.println(n+" Is "+isPos(arr, n));
    }
}