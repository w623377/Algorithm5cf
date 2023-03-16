package schooloj.盛最多的水.目标和;
class Solution {
    int count = 0;
    public int findTargetSumWays(int[] nums, int target) {
        backtrack(nums, target, 0, 0);
        return count;
    }
    public void backtrack(int[] nums, int target, int index, int sum) {//递归含义是：在sum的基础上，添加nums[index]到nums[nums.length-1]的数
        if (index == nums.length) {
            if (sum == target) {
                count++;
            }
        } else {
            backtrack(nums, target, index + 1, sum + nums[index]);
            backtrack(nums, target, index + 1, sum - nums[index]);
        }
    }
}

