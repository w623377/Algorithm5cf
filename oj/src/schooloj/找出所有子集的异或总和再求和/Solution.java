package schooloj.找出所有子集的异或总和再求和;
import java.util.ArrayList;
public class Solution {
    public int res=0;
    public  int subsetXORSum(ArrayList<Integer> list) {
        if (list.size() == 1) {//如果只有一个元素，直接返回
            return list.get(0);
        }
        backtrack(list,0,0);
        return res ;
    }
    private void backtrack(ArrayList<Integer> list, int sum, int cur) {//递归含义是：在sum的基础上，添加list.get(cur)到list.get(list.size()-1)的数
        if(cur==list.size()) {//递归出口
            res=res+sum;//计算结果
            return;//返回
        }
        backtrack(list,sum^list.get(cur),cur+1);//^异或
        backtrack(list,sum,cur+1);//不加入
    }

}
