package schooloj.戳气球;
public class Solution {
    public static int maxCoins(int[] nums) {
        int n = nums.length;
        int[] newNums = new int[n + 2];//新数组，首尾各加一个1
        newNums[0] = 1;
        newNums[n + 1] = 1;
        for (int i = 0; i < n; i++) {
            newNums[i + 1] = nums[i];
        }
        int[][] dp = new int[n + 2][n + 2];//dp[i][j]表示戳破气球i和气球j之间（开区间，不包括i和j）的所有气球能得到的最多硬币数
        for (int i = n; i >= 0; i--) {//从后往前遍历
            for (int j = i + 1; j < n + 2; j++) {//从i+1开始遍历
                for (int k = i + 1; k < j; k++) {//k表示最后戳破的气球
                    dp[i][j] = Math.max(dp[i][j], dp[i][k] + dp[k][j] + newNums[i] * newNums[k] * newNums[j]);
                }
            }
        }
        return dp[0][n + 1];
    }
}
