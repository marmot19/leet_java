package main.cczq.zrh;

import java.util.Arrays;

public class Solutions63 {
	public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int row_num = obstacleGrid.length;
        int col_num = obstacleGrid[0].length;
        if(obstacleGrid[0][0]==1) return 0;
        obstacleGrid[0][0]=1;
        for(int i=1;i<row_num;i++) {
        	obstacleGrid[i][0]= (obstacleGrid[i][0]==0 && obstacleGrid[i-1][0]==1)?1:0;
        }
        for(int j=1;j<col_num;j++) {
        	obstacleGrid[0][j]=(obstacleGrid[0][j]==0&&obstacleGrid[0][j-1]==1?1:0);
        }
        for(int i=1;i<row_num;i++) {
        	for(int j=1;j<col_num;j++) {
        		if(obstacleGrid[i][j]==0) {
        			obstacleGrid[i][j]=obstacleGrid[i-1][j]+obstacleGrid[i][j-1];
        		}else {
        			obstacleGrid[i][j]=0;
        		}
        	}
        }
        return obstacleGrid[row_num-1][col_num-1];
    }
	
	public static void main(String[] args) {
		Solutions63 s = new Solutions63();
		int[][] obstacleGrid = {{0,0},{1,0}};
		System.out.println(s.uniquePathsWithObstacles(obstacleGrid));
	}
}
