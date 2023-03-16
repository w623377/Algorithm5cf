package schooloj.最长回文串;
public class Solution {
    public int longestPalindrome(String s) {
        int[] count = new int[128];//count[i]表示字符i出现的次数
        for (char c : s.toCharArray()) {//遍历字符串
            count[c]++;//统计字符出现的次数
        }
        int ans = 0;//回文串的长度
        for (int v : count) {//遍历count数组
            ans += v / 2 * 2;//如果v是偶数，直接加到ans中，如果v是奇数，减1再加到ans中
            if (ans % 2 == 0 && v % 2 == 1) {//如果ans是偶数，且v是奇数，ans加1
                ans++;
            }
        }
        return ans;//返回ans
    }
}
