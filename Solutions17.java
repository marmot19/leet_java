package main.cczq.zrh;

import java.util.*;

public class Solutions17 {
	Map<String, String> dic = new HashMap<String, String>(){
    	{
    		put("2", "abc");
    		put("3", "def");
    		put("4", "ghi");
    		put("5", "jkl");
    		put("6", "mno");
    		put("7", "pqrs");
    		put("8", "tuv");
    		put("9", "wxyz");
    	}
    };
    
    
    List<String> result = new ArrayList<String>();
	public void backtrack(String combination, String next_digits) {
    	if(next_digits.length()==0) {
    		result.add(combination);
    	}else {
	    	String letters = dic.get(next_digits.substring(0, 1));
	    	for(int i=0;i<letters.length();i++) {
	    		String letter = letters.substring(i,i+1);
	    		backtrack(combination+letter, next_digits.substring(1));
	    	}
    	}
    }
	public List<String> letterCombinations(String digits) {
        if(digits.length()!=0) {
        	backtrack("", digits);
        }
        return result;
    }
	
	public static void main(String[] args) {
		String digits = "23";
		Solutions17 solutions17 = new Solutions17();
		System.out.println(solutions17.letterCombinations(digits));
	}
}
