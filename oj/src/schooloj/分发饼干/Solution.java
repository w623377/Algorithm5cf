package schooloj.分发饼干;
public class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int count = 0;//满足孩子的数量
        int i = 0;//孩子的下标
        int j = 0;//饼干的下标
        while (i < g.length && j < s.length) {//遍历孩子和饼干
            if (g[i] <= s[j]) {//如果饼干能满足孩子
                count++;//满足孩子的数量加1
                i++;//孩子下标加1
                j++;//饼干下标加1
            } else {//如果饼干不能满足孩子
                j++;//饼干下标加1
            }
        }
        return count;//返回满足孩子的数量
    }
}
