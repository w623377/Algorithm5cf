package schooloj.移掉k位数字;

public class Solution {
    public String removeKdigits(String num, int k) {
        if (num.length() == k) {//如果要移除的数字的数量等于字符串的长度
            return "0";//返回0
        }
        StringBuilder sb = new StringBuilder(num);//创建StringBuilder对象
        for (int i = 0; i < k; i++) {//移除k次,//从左到右，找到第一个比后面的数字大的数字，删除
                                    //如果没有找到，删除最后一个数字
                                    //重复k次
            int j = 0;//下标
            while (j < sb.length() - 1 && sb.charAt(j) <= sb.charAt(j + 1)) {//遍历字符串,找到第一个比后面的数字大的数字
                j++;//下标加1
            }
            sb.deleteCharAt(j);//删除下标为j的字符
        }
        while (sb.length() > 1 && sb.charAt(0) == '0') {//如果字符串的长度大于1并且第一个字符为0
            sb.deleteCharAt(0);//删除第一个字符
        }
        return sb.toString();//返回字符串
    }
}
