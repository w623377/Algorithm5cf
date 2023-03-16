package schooloj.寻找多数;
import java.util.Arrays;
class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}
