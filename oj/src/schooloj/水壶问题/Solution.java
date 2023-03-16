package schooloj.水壶问题;

public class Solution {
    public static boolean f(int x, int y,int z){//x,y为两个水壶的容量，z为目标容量
        if(x+y<z)return false;//如果两个水壶的容量之和小于目标容量，返回false
        if(x==0||y==0){//如果有一个水壶的容量为0
            return z==0||x+y==z;//如果目标容量为0或者两个水壶的容量之和等于目标容量，返回true
        }
        return z%gcd(x,y)==0;//如果目标容量能被两个水壶的容量的最大公约数整除，返回true
    }
    public static int gcd(int x,int y){
        int renainder=x%y;
        while(renainder!=0){
            x=y;
            y=renainder;
            renainder=x%y;
        }
        return y;
    }
}
