package schooloj.电话号码的字母组合;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public  List<String>result=new ArrayList<>();
    public  StringBuilder temp=new StringBuilder();

    public List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();
        if (digits.length() == 0) {//如果字符串为空，直接返回
            return list;
        }
        String[] numString = new String[]{"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        backtrack(digits,numString,0);//递归
        return list;
    }

    public void backtrack(String digits,String[]numString,int num) {//递归含义是：在temp的基础上，添加numString[digits.charAt(num)-'2']的字符

        if(num==digits.length()) {//如果num等于字符串的长度，说明已经添加完了，将temp加入结果集
            result.add(temp.toString());
            return;
        }

        String str=numString[digits.charAt(num)-'2'];//获取numString[digits.charAt(num)-'2']的字符串
        for(int i=0;i<str.length();i++) {//遍历字符串
            temp.append(str.charAt(i));//添加字符
            backtrack(digits,numString,num+1);//继续递归
            temp.deleteCharAt(temp.length()-1);//删除最后一个字符
        }
    }
}
