package schooloj.整数拆分;
public class Solution {
    public static int integerBreak(int n) {
        //两种方案
        //将 i 拆分成 j 和 i-j 的和，且 i-j不再拆分成多个正整数，此时的乘积是    j×(i−j)；
        //将 i 拆分成 j 和 i-j 的和，且 i-j继续拆分成多个正整数，此时的乘积是    j×dp[i−j]。

        int[] dp = new int[n + 1];//dp[i]表示i的最大乘积,dp[2]=1,dp[3]=2
        dp[2] = 1;
        for (int i = 3; i <= n; i++) {// i表示当前的数字
            for (int j = 1; j<= i; j++) {// j表示当前数字的分割点
                dp[i] = Math.max(dp[i],Math.max(j*(i-j),j*dp[i-j]));//j*(i-j)表示不分割，j*dp[i-j]表示分割
            }
        }
        return dp[n];
    }
}
