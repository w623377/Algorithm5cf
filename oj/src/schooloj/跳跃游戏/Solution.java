package schooloj.跳跃游戏;

public class Solution {
    public boolean canJump(int[] nums) {
        int max=0;//max为能跳到的最远位置
        for (int i = 0; i <nums.length ; i++) {
            if(i>max){//如果i大于max，说明i不可达
                return false;
            }
            max=Math.max(max,i+nums[i]);//更新max,能跳到的最远位置,当前位置加上当前位置的值
        }
        return true;
    }
}
