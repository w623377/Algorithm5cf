package schooloj.优美的排列;

public class Solution {
    int count = 0;//计数器

    public int countArrangement(int N) {
        boolean[] visited = new boolean[N + 1];//标记数组
        backtrack(N, 1, visited);//回溯
        return count;
    }

    public void backtrack(int N, int index, boolean[] visited) {//递归含义是：在index的基础上，添加1到N的数
        if (index == N + 1) {//递归出口,如果index==N+1，说明已经添加了1到N的数
            count++;
        } else {
            for (int i = 1; i <= N; i++) {
                if (!visited[i] && (i % index == 0 || index % i == 0)) {//如果i没有被访问过，并且i能被index整除或者index能被i整除
                    visited[i] = true;//标记i
                    backtrack(N, index + 1, visited);//递归
                    visited[i] = false;//回溯
                }
            }
        }
    }
}
