package schooloj.组合问题;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {

    List<List<Integer>>res = new ArrayList<>();
    LinkedList<Integer>path=new LinkedList<>();

    public List<List<Integer>> combine(int n, int k) {
        if(n==0||k==0||n<k)return res;//如果n<k，直接返回
        backTracking(n,k,1,res,path);//从1开始,递归含义是：在path的基础上，添加1到n的数
        return res;
    }
    public void backTracking(int n, int k, int startIndex,List<List<Integer>> result,LinkedList<Integer> path){//递归含义是：在path的基础上，添加startIndex到n的数
        if(path.size()==k){//如果path的长度等于k，将path加入结果集
            result.add(new ArrayList<>(path));
            return;//结束递归
        }
        for (int i = startIndex; i <=n-(k-path.size())+1; i++) {//i<=n-(k-path.size())+1，剪枝
            path.add(i);//加入i
            backTracking(n,k,i+1,result,path);//继续递归,递归含义是：在path的基础上，添加i+1到n的数
            path.removeLast();//删除最后一个元素,回溯
        }
    }
}
