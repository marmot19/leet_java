package main.cczq.zrh;

import java.util.Arrays;

/*一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为“Start” ）。

机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为“Finish”）。

问总共有多少条不同的路径？
*/
public class Solutions62 {
	public int uniquePaths(int m, int n) {
        int[] cur = new int[n];
        Arrays.fill(cur, 1);
        for(int i=1;i<m;i++) {
        	for(int j=1;j<n;j++) {
        		cur[j] += cur[j-1];
        	}
        }
        return cur[n-1];
    }
	
	
	public static void main(String[] args) {
		Solutions62 s = new Solutions62();
		System.out.println(s.uniquePaths(51, 9));
	}
}
