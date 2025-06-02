public class Fib {

    // 1. Pure Recursion (Exponential time)
    private static int fibrecursion(int n) {
        if (n == 0 || n == 1)
            return n;
        return fibrecursion(n - 1) + fibrecursion(n - 2);
    }

    // 2. Memoization (Top-Down DP) - Linear time
    private static int fibMemoisation(int n, int[] dp) {
        if (n == 0 || n == 1)
            return n;
        if (dp[n] != -1)
            return dp[n];
        dp[n] = fibMemoisation(n - 1, dp) + fibMemoisation(n - 2, dp);
        return dp[n];
    }

    // 3. Tabulation (Bottom-Up DP) - Linear time
    private static int fibTabulation(int n) {
        if (n == 0) return 0;
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++)
            dp[i] = dp[i - 1] + dp[i - 2];
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 7;

        System.out.println("Fibonacci using Recursion: " + fibrecursion(n));

        int[] dp = new int[n + 1];
        for (int i = 0; i <= n; i++) dp[i] = -1;
        System.out.println("Fibonacci using Memoization: " + fibMemoisation(n, dp));

        System.out.println("Fibonacci using Tabulation: " + fibTabulation(n));
    }
}
