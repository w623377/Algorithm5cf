package schooloj.爬楼梯;
public class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n + 1];//dp[i]表示爬到第i阶楼梯的方法数
        for (int i = 1; i <= n; i++) {//遍历楼梯
            if (i == 1) {//第一阶楼梯只有一种方法
                dp[i] = 1;
            } else if (i == 2) {//第二阶楼梯有两种方法
                dp[i] = 2;
            } else {
                dp[i] = dp[i - 1] + dp[i - 2];//dp[i]等于dp[i-1]和dp[i-2]之和
            }
        }
        return dp[n];//返回dp[n]
    }
}
