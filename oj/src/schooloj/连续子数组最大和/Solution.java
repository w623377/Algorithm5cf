package schooloj.连续子数组最大和;

class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];//dp[i]表示以nums[i]结尾的连续子数组的最大和
        dp[0] = nums[0];//初始化
        int max = dp[0];//最大值
        for (int i = 1; i < n; i++) {
            dp[i] = Math.max(dp[i - 1] + nums[i], nums[i]);//状态转移方程
            max = Math.max(max, dp[i]);//更新最大值
        }
        return max;
    }
}
