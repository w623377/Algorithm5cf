package schooloj.摆动序列;
import java.util.ArrayList;
public class Solution {
    public static int wiggleMaxLength(ArrayList<Integer> arr) {//摆动序列
        if(arr.size() < 2){
            return arr.size();
        }
        int curDiff=0;//当前差值
        int preDiff=0;//前一个差值
        int res=1;//记录峰值个数，序列默认序列最右边有一个峰值
        for (int i = 0; i <arr.size()-1; i++) {
            curDiff=arr.get(i+1)-arr.get(i);
            //如果当前差值和前一个差值异号，说明当前位置是峰值
            if((curDiff>0&&preDiff<=0)||(curDiff<0&&preDiff>=0)){
                res++;
                preDiff=curDiff;//更新前一个差值
            }
        }
        return res;
    }
}
