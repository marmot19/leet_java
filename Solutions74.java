package main.cczq.zrh;
/*编写一个高效的算法来判断 m x n 矩阵中，是否存在一个目标值。该矩阵具有如下特性：

每行中的整数从左到右按升序排列。
每行的第一个整数大于前一行的最后一个整数。

*/
public class Solutions74 {
	public boolean searchMatrix(int[][] matrix, int target) {
		int rows = matrix.length;
		if(rows==0) return false;
		int cols = matrix[0].length;
		
		int left = 0;
		int right = rows*cols - 1;
		while(left<=right) {
			int pivot = (left+right)/2;
			int pivotElem = matrix[pivot/cols][pivot%cols];
			if(pivotElem==target) {
				return true;
			}else if(pivotElem>target) {
				right = pivot-1;
			}else {
				left = pivot+1;
			}
		}
		return false;
    }
	
	
	
	public static void main(String[] args) {
		int[][] matrix = {{1,   3,  5,  7},{10, 11, 16, 20},{23, 30, 34, 50}};
//		int[][] matrix = {{1}};
		Solutions74 s = new Solutions74();
		System.out.println(s.searchMatrix(matrix,3));
	}
}
