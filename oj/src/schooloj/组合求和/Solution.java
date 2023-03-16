package schooloj.组合求和;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
     List<List<Integer>> res=new ArrayList<>();//存放结果
     LinkedList<Integer> path=new LinkedList<>();//双向链表，存放路径


    public List<List<Integer>> combinationSum3(int k, int n) {
        backtrack(1, 9, k, n);
        return res;
    }

    public  void backtrack(int k,int n,int sum,int index){
        if(sum>n)return;//剪枝
        if(path.size()==k){//找到一个组合
            if(sum==n){//判断是否满足条件
                res.add(new ArrayList<>(path));//添加到结果集
                return;//返回
            }
        }
        for (int i = index; i <=9-(k-path.size())+1; i++) {//剪枝
            path.add(i);//添加到路径
            sum+=i;
            backtrack(k,n,sum,i+1);//递归
            path.removeLast();//回溯
            sum-=i;//回溯
        }
    }
}
