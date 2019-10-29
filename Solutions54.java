package main.cczq.zrh;
import java.util.*;
public class Solutions54 {
	public List<Integer> spiralOrder(int[][] matrix) {
//		0代表横向递增，1代表纵向递增，2代表横向递减，3代表纵向递减
        int dir = 0;
        List<Integer> ans = new ArrayList<Integer>();
        Map<String, Integer> map = new HashMap<String, Integer>();
        int height = matrix.length;
        if(height==0) return new ArrayList<Integer>();
        int width = matrix[0].length;
        int row = 0;
        int col = 0;
        while(map.entrySet().size()<width*height+3) {
        	StringBuilder sb = new StringBuilder();
        	sb.append(row);
        	sb.append("#");
        	sb.append(col);
        	if(map.containsKey(sb.toString())) {
        		switch(dir) {
        			case 0:
        				col--;
        				row++;
        				break;
        			case 1:
        				col--;
        				row--;
        				break;
        			case 2:
        				col++;
        				row--;
        				break;
        			case 3:
        				row++;
        				col++;
        				break;
        		}
        		dir=(dir+1)%4;
        	}else {
        		map.put(sb.toString(), 1);
        		if(dir==0 && col<width) {
            		ans.add(matrix[row][col++]);
            	}else if(dir==1 && row<height) {
            		ans.add(matrix[row++][col]);
            	}else if(dir==2 && width>col && col>=0) {
            		ans.add(matrix[row][col--]);
            	}else if(dir==3 && row>=0 && row<height) {
            		ans.add(matrix[row--][col]);
            	}
        	}
        	
        }
        return ans;
    }
	public static void main(String[] args) {
		Solutions54 s = new Solutions54();
		int[][] matrix = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
		System.out.println(s.spiralOrder(matrix));
	}
	
	
}
