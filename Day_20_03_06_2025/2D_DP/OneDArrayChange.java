import java.util.*;
public class OneDArrayChange {
    // Check if a target sum is possible using any number of given coins (unbounded)
    public static boolean isPossible(int[] coins, int target) {
        boolean[] dp = new boolean[target + 1];
        dp[0] = true; // sum 0 is always possible
        for (int coin : coins) {
            for (int j = coin; j <= target; j++) {
                if (dp[j - coin]) {
                    dp[j] = true;
                }
            }
        }
        return dp[target];
    }

    // Find the minimum number of coins needed to make the target sum (unbounded)
    public static int minCoins(int[] coins, int target) {
        int[] dp = new int[target + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int coin : coins) {
            for (int j = coin; j <= target; j++) {
                if (dp[j - coin] != Integer.MAX_VALUE) {
                    dp[j] = Math.min(dp[j], dp[j - coin] + 1);
                }
            }
        }
        return dp[target] == Integer.MAX_VALUE ? -1 : dp[target];
    }

    // Main method to test both functionalities
    public static void main(String[] args) {
        int[] coins = {2, 3, 4, 5};
        int target1 = 7;
        int target2 = 19;
        for (int target : new int[]{target1, target2}) {
            System.out.println("Target: " + target);
            if (isPossible(coins, target)) {
                System.out.println("  -> Possible");
                System.out.println("  -> Min Coins: " + minCoins(coins, target));
            } else {
                System.out.println("  -> Not Possible");
            }
        }
    }
}