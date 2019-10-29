package main.cczq.zrh;

import java.util.HashMap;

/*
 * 判断一个 9x9 的数独是否有效。只需要根据以下规则，验证已经填入的数字是否有效即可。

数字 1-9 在每一行只能出现一次。
数字 1-9 在每一列只能出现一次。
数字 1-9 在每一个以粗实线分隔的 3x3 宫内只能出现一次。
*/
public class Solutions36 {
	public boolean isValidSudoku(char[][] board) {
//        box_index = (row_index/3)*3+column_index/3
		HashMap<Integer,Integer>[]  rows = new HashMap[9];
		HashMap<Integer,Integer>[]  columns = new HashMap[9];
		HashMap<Integer,Integer>[]  boxes = new HashMap[9];
		for(int i=0;i<9;i++) {
			rows[i] = new HashMap<Integer, Integer>();
			columns[i] = new HashMap<Integer, Integer>();
			boxes[i] = new HashMap<Integer, Integer>();
		}
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				int box_index = (i/3)*3+j/3;
				char c = board[i][j];
				int num = (int)c;
				if(c=='.') continue;
				rows[i].put(num, rows[i].getOrDefault(num, 0)+1);
				columns[j].put(num, columns[j].getOrDefault(num, 0)+1);
				boxes[box_index].put(num, boxes[box_index].getOrDefault(num, 0)+1);
				if(rows[i].get(num)>1 || columns[j].get(num)>1 || boxes[box_index].get(num)>1) {
					return false;
				}
			}
		}
		return true;
		
    }
}
