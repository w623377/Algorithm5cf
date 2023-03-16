package schooloj.最长回文子串;

public class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        boolean[][] dp = new boolean[n][n];//dp[i][j]表示s[i..j]是否为回文子串
        String ans = "";//ans表示最长回文子串
        for (int i = n - 1; i >= 0; i--) {//倒序遍历字符串，因为dp[i][j]依赖于dp[i+1][j-1]
            for (int j = i; j < n; j++) {//正序遍历字符串，因为dp[i][j]依赖于dp[i+1][j-1]
                dp[i][j] = s.charAt(i) == s.charAt(j) && (j - i < 2 || dp[i + 1][j - 1]);//dp[i][j]等于s[i]==s[j]且dp[i+1][j-1]为真，j-i<2表示s[i..j]长度小于等于2
                if (dp[i][j] && j - i + 1 > ans.length()) {//如果dp[i][j]为真且长度大于ans
                    ans = s.substring(i, j + 1);//更新ans
                }
            }
        }
        return ans;//返回ans
    }
}
