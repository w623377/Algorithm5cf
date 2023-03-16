package schooloj.走网格;

public class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];//dp[i][j]表示从左上角走到(i,j)的路径数
        for (int i = 0; i < m; i++) {//遍历行
            for (int j = 0; j < n; j++) {//遍历列
                if (i == 0 || j == 0) {//第一行和第一列的路径数都为1
                    dp[i][j] = 1;
                } else {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];//dp[i][j]等于dp[i-1][j]和dp[i][j-1]之和
                }
            }
        }
        return dp[m - 1][n - 1];//返回dp[m-1][n-1]
    }
}
