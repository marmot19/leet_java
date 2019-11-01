package main.cczq.zrh;

import java.util.Arrays;

/*给定一个 m x n 的矩阵，如果一个元素为 0，则将其所在行和列的所有元素都设为 0。请使用原地算法。
 * 输入: 
[
  [1,1,1],
  [1,0,1],
  [1,1,1]
]
输出: 
[
  [1,0,1],
  [0,0,0],
  [1,0,1]
]
*/
public class Solutions73 {
	public void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        if(rows==0) return;
        int cols = matrix[0].length;
        int[] ans = new int[rows+cols];
        Arrays.fill(ans, 1);
        for(int i=0;i<rows;i++) {
        	for(int j=0;j<cols;j++) {
        		if(matrix[i][j]==0) {
        			ans[i]=0;
        			ans[rows+j]=0;
        		}
        	}
        }
        for(int i=0;i<rows;i++) {
        	if(ans[i]==0) {
        		for(int j=0;j<cols;j++) matrix[i][j]=0;
        	}
        }
        for(int j=rows;j<rows+cols;j++) {
        	if(ans[j]==0) {
        		for(int i=0;i<rows;i++) matrix[i][j-rows]=0;
        	}
        }
    }
	public static void main(String[] args) {
		Solutions73 s = new Solutions73();
//		int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
		int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
		s.setZeroes(matrix);
	}
}
