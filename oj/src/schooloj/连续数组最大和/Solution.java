package schooloj.连续数组最大和;

public class Solution {
    public int maxSubArray(int[] nums) {
        int pre=0;//前一个元素的最大和
        int maxNum=nums[0];//最大和
        for(int x:nums){//遍历数组
            pre=Math.max(pre+x,x);//当前元素的最大和
            maxNum=Math.max(maxNum,pre);//更新最大和
        }
        return maxNum;
    }
}
