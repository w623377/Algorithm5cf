package schooloj.打家劫舍;
public class Solution {
    public static int rob(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;//如果数组为空，返回0
        if (n == 1) return nums[0];//如果数组只有一个元素，返回该元素
        if (n == 2) return Math.max(nums[0], nums[1]);//如果数组有两个元素，返回两个元素中的最大值
        int[] dp = new int[n];//dp[i]表示前i个元素能偷到的最大值
        dp[0] = nums[0];//第一个元素
        dp[1] = Math.max(nums[0], nums[1]);//第二个元素
        for (int i = 2; i < n; i++) {//从第三个元素开始
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);//dp[i-1]表示不偷第i个元素，dp[i-2]+nums[i]表示偷第i个元素
        }
        return dp[n - 1];
    }
}
