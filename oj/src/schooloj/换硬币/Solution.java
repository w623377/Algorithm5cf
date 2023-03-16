package schooloj.换硬币;
public class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];//dp[i]表示凑成i元需要的最少硬币数
        for (int i = 1; i <= amount; i++) {//遍历凑成的金额
            dp[i] = Integer.MAX_VALUE;//初始化为最大值
            for (int coin : coins) {//遍历硬币
                if (i >= coin && dp[i - coin] != Integer.MAX_VALUE) {//凑成i元需要的最少硬币数大于凑成i-coin元需要的最少硬币数加一
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);//更新凑成i元需要的最少硬币数
                }
            }
        }
        return dp[amount] == Integer.MAX_VALUE ? -1 : dp[amount];//返回凑成amount元需要的最少硬币数
    }
}
