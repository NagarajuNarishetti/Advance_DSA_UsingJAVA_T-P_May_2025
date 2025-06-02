public class coins {
    public static void main(String[] args) {
        int[] coins = {2, 3, 4, 5};
        int n = coins.length;
        int maxSum = 14;

        boolean[][] dp = new boolean[n][maxSum + 1];

        // Base case: sum = 0 is always possible
        for (int i = 0; i < n; i++) {
            dp[i][0] = true;
        }

        // Base case: first coin
        if (coins[0] <= maxSum) {
            dp[0][coins[0]] = true;
        }

        // Fill the DP table
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= maxSum; j++) {
                // Don't take coin[i]
                dp[i][j] = dp[i - 1][j];

                // Take coin[i] if it fits
                if (j >= coins[i]) {
                    dp[i][j] = dp[i][j] || dp[i - 1][j - coins[i]];
                }
            }
        }

        // Output all possible sums
        System.out.println("Possible sums using each coin at most once:");
        for (int sum = 1; sum <= maxSum; sum++) {
            if (dp[n - 1][sum]) {
                System.out.print(sum + " ");
            }
        }
    }
}