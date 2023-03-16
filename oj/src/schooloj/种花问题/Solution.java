package schooloj.种花问题;

public class Solution {
//    public boolean canPlaceFlowers(int[] flowerbed, int n) {
//        int count = 0;//计数器
//        int m = flowerbed.length;//花坛长度
//        for (int i = 0; i < m && count < n; i++) {//遍历花坛，计数器小于n
//            if (flowerbed[i] == 1) {//当前位置有花
//                continue;//跳过
//            }
//            int pre = (i == 0) ? 0 : flowerbed[i - 1];//前一个位置
//            int next = (i == m - 1) ? 0 : flowerbed[i + 1];//后一个位置
//            if (pre == 0 && next == 0) {//前后都没有花
//                flowerbed[i] = 1;//种花
//                count++;//计数器加一
//            }
//        }
//        return count == n;//计数器等于n，返回true
//    }


    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for (int i = 0, len = flowerbed.length; i < len && n > 0;) {
            if (flowerbed[i] == 1) {
                i += 2;//当前位置有花，跳过
            } else if (i == flowerbed.length - 1 || flowerbed[i + 1] == 0) {//当前位置没有花，且后一个位置没有花，最后一个位置时，后一个位置也没有花
                n--;
                i += 2;
            } else {//当前位置没有花，后一个位置有花
                i += 3;
            }
        }
        return n <= 0;
    }

}
