package schooloj.三角形的最大周长;

public class Solution {
    public int largestPerimeter(int[] A) {
        int max = 0;//最大周长
        for (int i = 0; i < A.length; i++) {//遍历数组
            for (int j = i + 1; j < A.length; j++) {//遍历数组
                for (int k = j + 1; k < A.length; k++) {//遍历数组
                    if (A[i] + A[j] > A[k] && A[i] + A[k] > A[j] && A[j] + A[k] > A[i]) {//如果能构成三角形
                        max = Math.max(max, A[i] + A[j] + A[k]);//更新最大周长
                    }
                }
            }
        }
        return max;//返回最大周长
    }
}
