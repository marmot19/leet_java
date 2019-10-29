package main.cczq.zrh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solutions60 {
	public StringBuilder ans = new StringBuilder();
	public String getPermutation(int n, int k) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i=1;i<=n;i++) list.add(i);
        
        myPer(list, n, k);
        return ans.toString();
    }
	
	public void myPer(List<Integer> list, int n ,int k) {
		if(n==1) {
			ans.append(list.get(0));
			return;
		}
		Collections.sort(list);
		int temp = fact(n-1);
		int m = k/temp;
		int h = k%temp;
		
		if(h>0) {
			ans.append(list.get(m));
			list.remove(m);
		}else if(h==0 && m>=1) {
			ans.append(list.get(m-1));
			list.remove(m-1);
			h = temp;
		}
		myPer(list, n-1, h);
	}
	
	public int fact(int n) {
		if(n==1) return n;
		return n*fact(n-1);
	}
	
	public static void main(String[] args) {
		Solutions60 s = new Solutions60();
		System.out.println(s.getPermutation(4, 6));
	}
}
