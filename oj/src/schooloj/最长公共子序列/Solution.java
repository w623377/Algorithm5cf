package schooloj.最长公共子序列;
public class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();
        int[][] dp = new int[m + 1][n + 1];//dp[i][j]表示text1[0,i)和text2[0,j)的最长公共子序列
        for (int i = 1; i <= m; i++) {//遍历text1
            for (int j = 1; j <= n; j++) {//遍历text2
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {//如果text1[i-1]和text2[j-1]相等
                    dp[i][j] = dp[i - 1][j - 1] + 1;//dp[i][j]等于dp[i-1][j-1]+1
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);//dp[i][j]等于dp[i-1][j]和dp[i][j-1]中的最大值
                }
            }
        }
        return dp[m][n];//返回dp[m][n]
    }
}
