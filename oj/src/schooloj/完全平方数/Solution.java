package schooloj.完全平方数;
public class Solution {
    public int numsquraes(int n){
        int max=Integer.MAX_VALUE;
        int[] dp=new int[n+1];//dp[i]为平方和为i的最小数量
        for (int i = 0; i <=n ; i++) {
            dp[i]=max;
        }
        dp[0]=0;
        for (int i = 1; i <=n ; i++) {//i为平方和
            for (int j = 1; j*j <=i ; j++) {//j为平方数
                dp[i]=Math.min(dp[i],dp[i-j*j]+1);//dp[i-j*j]为平方和为i-j*j的最小数量
            }
        }
        return dp[n];
    }
}
