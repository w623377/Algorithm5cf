package schooloj.找到k个最长重复子串;
import java.util.HashMap;
public class Solution {
//    public int longestSubString(String s, int k){//递归函数的含义是求一个最长的子字符串的长度，该子字符串中每个字符出现的次数都最少为k
//        int length = s.length();
//        if(length==0 || k>length) return 0;//特殊情况
//        int[] count = new int[26];//记录每个字母出现的次数
//        for (int i = 0; i < length; i++) {
//            count[s.charAt(i) - 'a']++;
//        }
//        int i = 0;
//        while (i < length && count[s.charAt(i) - 'a'] >= k) {//找到第一个出现次数小于k的字母的位置i
//            i++;
//        }
//        if (i == length) {
//            return length;//如果i==length，说明s中的每个字母都出现了至少k次，直接返回s的长度
//        }
//        int left = longestSubString(s.substring(0, i), k);//递归计算s[0,i-1]中的最长子串
//        while (i < length && count[s.charAt(i) - 'a'] < k) {//找到第一个出现次数大于等于k的字母的位置i
//            i++;
//        }
//        int right = longestSubString(s.substring(i), k);//递归计算s[i,length-1]中的最长子串
//        return Math.max(left, right);//返回两个子串中较长的那个
//    }
        public int longestSubstring(String s, int k) {//递归函数的含义是求一个最长的子字符串的长度，该子字符串中每个字符出现的次数都最少为k
            if (s.length() < k) return 0;//特殊情况
            HashMap<Character, Integer> counter = new HashMap();//记录每个字母出现的次数
            for (int i = 0; i < s.length(); i++) {//统计每个字母出现的次数
                counter.put(s.charAt(i), counter.getOrDefault(s.charAt(i), 0) + 1);//如果counter中没有s.charAt(i)这个键，就将其值设为0，然后加1
            }
            for (char c : counter.keySet()) {//遍历counter中的所有键
                if (counter.get(c) < k) {//如果某个字母出现的次数小于k
                    int res = 0;//记录最终结果
                    for (String t : s.split(String.valueOf(c))) {//将s按照c分割成若干个子串，然后递归计算每个子串的最长子串
                        res = Math.max(res, longestSubstring(t, k));//更新最终结果
                    }
                    return res;//返回最终结果
                }
            }
            return s.length();//如果s中的每个字母都出现了至少k次，直接返回s的长度
        }


}
