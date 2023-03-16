package schooloj.柠檬水找零;

public class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0, ten = 0;//5元和10元的数量
        for (int bill : bills) {//遍历账单
            if (bill == 5) {
                five++;//5元账单，5元数量加一
            } else if (bill == 10) {//10元账单
                if (five == 0) {//5元数量为0，无法找零
                    return false;
                }
                five--;//5元数量减一
                ten++;//10元数量加一
            } else {
                if (five > 0 && ten > 0) {//5元数量大于0且10元数量大于0，优先找零10元
                    five--;//5元数量减一
                    ten--;//10元数量减一
                } else if (five >= 3) {//5元数量大于等于3，找零3张5元
                    five -= 3;
                } else {
                    return false;//无法找零
                }
            }
        }
        return true;//遍历完账单，返回true
    }
}
