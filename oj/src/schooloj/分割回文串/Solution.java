package schooloj.分割回文串;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class Solution {
    public  ArrayList<ArrayList<String>> result=new ArrayList<>();//存放结果
    public Deque<String> path=new LinkedList<>();//存储路径
    //回溯法分割回文串
    public void SplitPalindromeString(String str,int cur){//cur表示当前位置
        if(cur>=str.length()){//递归出口
            result.add(new ArrayList<>(path));//将当前路径加入结果集
            return;//返回
        }
        for (int i = cur; i <str.length() ; i++) {//从当前位置开始，依次判断是否为回文串
            if(isPalindrome(str,cur,i)){//如果是回文串
                path.add(str.substring(cur,i+1));//加入路径
                SplitPalindromeString(str,i+1);//递归
                path.removeLast();//回溯
            }
        }
    }
    private boolean isPalindrome(String str, int cur, int i) {
        while (cur<i){
            if(str.charAt(cur)!=str.charAt(i)){
                return false;
            }
            cur++;
            i--;
        }
        return true;
    }

}
