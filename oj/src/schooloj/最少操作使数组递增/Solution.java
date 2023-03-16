package schooloj.最少操作使数组递增;

public class Solution {
    public int minOperations(int[] nums) {//最少操作使数组递增
        int count=0;
        for (int i = 1; i <nums.length ; i++) {
            if(nums[i]<=nums[i-1]){//如果nums[i]小于等于nums[i-1]
                count+=nums[i-1]-nums[i]+1;//count加上nums[i-1]-nums[i]+1
                nums[i]=nums[i-1]+1;//nums[i]变为nums[i-1]+1
            }
        }
        return count;
    }
}
