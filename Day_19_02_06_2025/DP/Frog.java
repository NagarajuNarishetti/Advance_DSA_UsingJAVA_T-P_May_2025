import java.util.*;
public class Frog {
    private static int ans = Integer.MAX_VALUE;
    // Recursive brute force (already given)
    private static int jump(int[] arr, int i, int Energy) {
        if (i == arr.length - 1) {
            ans = Math.min(ans, Energy);
            return ans;
        }
        if (i + 1 < arr.length) {
            jump(arr, i + 1, Energy + (Math.abs(arr[i + 1] - arr[i])));
        }
        if (i + 2 < arr.length) {
            jump(arr, i + 2, Energy + (Math.abs(arr[i + 2] - arr[i])));
        }
        return ans;
    }
    // Recursive with dp (top-down) — frogRecr filled
    private static int frogRecr(int[] dp, int[] arr, int n) {
        if (n == 0) return 0;
        if (dp[n] != -1) return dp[n];
        int oneStep = frogRecr(dp, arr, n - 1) + Math.abs(arr[n] - arr[n - 1]);
        int twoStep = Integer.MAX_VALUE;
        if (n > 1) {
            twoStep = frogRecr(dp, arr, n - 2) + Math.abs(arr[n] - arr[n - 2]);
        }
        dp[n] = Math.min(oneStep, twoStep);
        return dp[n];
    }
    // Memoized version (just a wrapper to initialize dp)
    private static int frogMemo(int[] arr) {
        int n = arr.length;
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        return frogRecr(dp, arr, n - 1);
    }

    // Tabulation version (bottom-up)
    private static int frogTab(int[] arr) {
         int n = arr.length;
         if (n == 0) return 0;
         if (n == 1) return 0;

         int prev2 = 0;  // dp[i - 2]
         int prev1 = Math.abs(arr[1] - arr[0]);  // dp[i - 1]

         for (int i = 2; i < n; i++) {
            int oneStep = prev1 + Math.abs(arr[i] - arr[i - 1]);
             int twoStep = prev2 + Math.abs(arr[i] - arr[i - 2]);
            int curr = Math.min(oneStep, twoStep);
            prev2 = prev1;
            prev1 = curr;
            }

         return prev1;
        // int n = arr.length;
        // int[] dp = new int[n];
        // dp[0] = 0;
        // for (int i = 1; i < n; i++) {
        //     int oneStep = dp[i - 1] + Math.abs(arr[i] - arr[i - 1]);
        //     int twoStep = Integer.MAX_VALUE;
        //     if (i > 1) {
        //         twoStep = dp[i - 2] + Math.abs(arr[i] - arr[i - 2]);
        //     }
        //     dp[i] = Math.min(oneStep, twoStep);
        // }
        // return dp[n - 1];
    }
    // check correct or not
    public static int frogJumpK(int[] height, int k) {
    int n = height.length;
    int[] dp = new int[n];
    dp[0] = 0; // Start at 0 with no energy

    for (int i = 1; i < n; i++) {
        int minEnergy = Integer.MAX_VALUE;

        // Try jumping from any of the previous k stones
        for (int j = 1; j <= k; j++) {
            if (i - j >= 0) {
                int energy = dp[i - j] + Math.abs(height[i] - height[i - j]);
                minEnergy = Math.min(minEnergy, energy);
            }
        }

        dp[i] = minEnergy;
    }

    return dp[n - 1];
}

    public static void main(String[] args) {
        // int [] arr= {10,20,30,10};
        int[] arr = {10, 20, 30, 10, 30, 20, 10};

        // Recursive brute force
        jump(arr, 0, 0);
        System.out.println("Recursive (brute force) ans: " + ans);

        // Memoized recursion
    int memoAns = frogMemo(arr);
        System.out.println("Memoized recursion ans: " + memoAns);

        // Tabulation (bottom-up)
        int tabAns = frogTab(arr);
        System.out.println("Tabulation ans: " + tabAns);
        int k=2;
        System.out.println("For "+k+" jumps "+frogJumpK(arr, k));
    }
}
