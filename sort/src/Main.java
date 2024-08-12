import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = scanner.nextInt();
        }
        //每次消除连续之和最大的三个数，最多消除2次，使得剩下的数之和最小
        if(n<=3){
            System.out.println(0);
        }
        int res = 0;
        for(int i = 0; i < 2; i++){
            int max = 0;
            int index = 0;
            for(int j = 0; j < n-2; j++){
                int sum = nums[j] + nums[j+1] + nums[j+2];
                if(sum > max){
                    max = sum;
                    index = j;
                }
            }

            nums[index] = 0;
            nums[index+1] = 0;
            nums[index+2] = 0;
        }

        for(int i = 0; i < n; i++){
            res += nums[i];
        }
        System.out.println(res);

}

class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        int m = flowerbed.length;
        int prev = -1;
        for (int i = 0; i < m; i++) {
            if (flowerbed[i] == 1) {
                if (prev < 0) {
                    count += i / 2;
                } else {
                    count += (i - prev - 2) / 2;
                }
                prev = i;
            }
        }
        if (prev < 0) {
            count += (m + 1) / 2;
        } else {
            count += (m - prev - 1) / 2;
        }
        return count >= n;
    }
}
}


