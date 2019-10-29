package main.cczq.zrh;

import java.util.*;
public class Solutions22 {
	public List<String> generateParenthesis(int n) {
		List<String> result = new ArrayList<String>();
        Set<String> set = generateString(n*2);
        for(String s:set) {
        	if(isMatch(s)) result.add(s);
        }
        return result;
    }
	
	public boolean isMatch(String s) {
		Stack<String> q = new Stack<String>();
		for(int i=0;i<s.length();i++) {
			if(s.substring(i,i+1).equals("(")) {
				q.add("(");
			}else if(s.substring(i,i+1).equals(")" )){
				if(q.size()==0) {
					q.add(")" );
					continue;
				}
				String str = q.pop();
				if(str.equals("(")) {
					continue;
				}else if(str.equals(")")) {
					q.add(")");
					q.add(")");
				}else if(str==null) {
					q.add(")");
				}
			}
		}
		
		if(q.size()==0) {
			return true;
		}
		return false;
	}
	
	public Set<String> generateString(int n){
		Set result = new HashSet<String>();
		if(n==1) {
			result.add("(");
			result.add(")");
		}if(n>0) {
			for(String s : generateString(n-1)) {
				result.add("("+s);
				result.add(")"+s);
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		Solutions22 solutions22 = new Solutions22();
//		solutions22.generateString(6);
		System.out.println(solutions22.generateParenthesis(3));
	}
}
