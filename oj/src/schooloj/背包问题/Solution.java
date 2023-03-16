package schooloj.背包问题;

public class Solution {
    public int knapsack(int[] w, int[] v, int c) {
        int n = w.length;//物品数量
        int[][] dp = new int[n + 1][c + 1];//dp[i][j]表示前i个物品放入容量为j的背包中的最大价值
        for (int i = 1; i <= n; i++) {//遍历物品
            for (int j = 1; j <= c; j++) {//遍历容量
                if (j < w[i - 1]) {//容量小于物品重量，不能放入
                    dp[i][j] = dp[i - 1][j];//dp[i][j]等于dp[i-1][j]
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - w[i - 1]] + v[i - 1]);//dp[i][j]等于dp[i-1][j]和dp[i-1][j-w[i-1]]+v[i-1]之间的最大值
                }
            }
        }
        return dp[n][c];//返回dp[n][c]
    }
}
