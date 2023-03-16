package schooloj.括号生成;
import java.util.ArrayList;
import java.util.List;
public class Solution {
   List<String> res = new ArrayList<>();//结果集
    public  List<String>bracketGenerating(int n){
        if (n == 0) {
            return res;
        }
        backtrack(n,0,0,new StringBuilder());
        return res;
    }
    public void backtrack(int n,int l,int r,StringBuilder cur) {//l表示左括号的数量，r表示右括号的数量,递归含义是：在cur的基础上，添加左括号或者右括号
        if(l==n&&r==n) {//如果左右括号都用完了，将当前字符串加入结果集
            res.add(cur.toString());
            return;
        }
        if(l<r)return;//如果右括号的数量大于左括号的数量，直接返回

        if(l<n){//如果左括号还有剩余
            cur.append('(');//加入左括号
            backtrack(n,l+1,r,cur);//继续递归
            cur.deleteCharAt(cur.length()-1);//删除最后一个字符
        }
        if(r<n){//如果右括号还有剩余
            cur.append(')');//加入右括号
            backtrack(n,l,r+1,cur);//继续递归
            cur.deleteCharAt(cur.length()-1);//删除最后一个字符
        }
    }
}
