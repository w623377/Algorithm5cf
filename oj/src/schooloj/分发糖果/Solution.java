package schooloj.分发糖果;
import java.util.ArrayList;
public class Solution {
    public static int candy(ArrayList<Integer> arr) {//分发糖果
        int n= arr.size();
        int[] candy = new int[n];
        candy[0] = 1;//第一个孩子至少有一个糖果
        for (int i = 1; i <n ; i++) {//从左往右
            candy[i]=arr.get(i)>arr.get(i-1)?candy[i-1]+1:1;//如果比前一个大，就比前一个多一个糖果，否则就是1个
        }
        for (int i = n-2; i >=0 ; i--) {//从右往左
            if(arr.get(i)>arr.get(i+1)){//如果比后一个大
                candy[i]=Math.max(candy[i],candy[i+1]+1);//如果比后一个多一个糖果，就比后一个多一个糖果，否则就是1个
            }
        }
        int ans=0;
        for (int num :candy) {
            ans+=num;
        }
        return ans;
    }
}
