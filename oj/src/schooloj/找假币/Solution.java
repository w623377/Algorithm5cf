package schooloj.找假币;
public class Solution {
    public  int findOne(Integer[] a, int l, int r) {//找到假币
        if(l==r){//如果只有一个硬币
            return a[l];//返回这个硬币
        }
        int x=findOne(a,l,l+(r-l)/2);//找左边的假币
        int y=findOne(a,(l+(r-l)/2)+1,r);//找右边的假币
        return Math.min(x, y);//返回较小的那个
    }
}
