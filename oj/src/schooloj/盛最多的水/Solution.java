package schooloj.盛最多的水;

public class Solution {
    public int maxArea(int[] height) {
        //双指针,若向内 移动短板 ，水槽的短板 min(h[i], h[j])min(h[i],h[j]) 可能变大，因此下个水槽的面积 可能增大 。
        //若向内 移动长板 ，      水槽的短板 min(h[i], h[j])min(h[i],h[j])不变或变小，因此下个水槽的面积 一定变小
        int max = 0;
        int i = 0;//左边的下标
        int j = height.length - 1;//右边的下标
        while (i < j) {//当左边的下标小于右边的下标时
            int area = Math.min(height[i], height[j]) * (j - i);//计算面积
            max = Math.max(max, area);//更新最大面积
            if (height[i] < height[j]) {//如果左边的柱子矮
                i++;//左边的下标加1
            } else {
                j--;//右边的下标减1
            }
        }
        return max;
    }
}
