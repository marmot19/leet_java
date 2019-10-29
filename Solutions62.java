package main.cczq.zrh;

import java.util.Arrays;

/*һ��������λ��һ�� m x n ��������Ͻ� ����ʼ������ͼ�б��Ϊ��Start�� ����

������ÿ��ֻ�����»��������ƶ�һ������������ͼ�ﵽ��������½ǣ�����ͼ�б��Ϊ��Finish������

���ܹ��ж�������ͬ��·����
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
