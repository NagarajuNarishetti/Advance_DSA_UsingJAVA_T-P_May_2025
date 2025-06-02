import java.util.Arrays;
public class WeightedJobDP {
    public static void main(String[] args) {
        int[][] s = {{1, 3}, {2, 5}, {4, 6}, {6, 7}, {5, 8}, {7, 9}};
        int[] pr = {5, 6, 5, 4, 11, 2};
        // Copy pr into dp using Arrays.copyOf()
        int[] dp = Arrays.copyOf(pr, pr.length);
        for (int j = 1; j < pr.length; j++) {
            for (int i = 0; i < j; i++) {
                if (s[i][1] <= s[j][0]) {
                    dp[j] = Math.max(dp[j], pr[j] + dp[i]);
                }
            }
        }
        // Print the dp array
        System.out.println(Arrays.toString(dp));
    }
}