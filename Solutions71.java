package main.cczq.zrh;

import java.util.Stack;

public class Solutions71 {
	public String simplifyPath(String path) {
        String[] strs = path.split("/");
        Stack<String> stack = new Stack<>();
        for(int i=0;i<strs.length;i++) {
        	if(strs[i].equals("..")&&!stack.isEmpty()) stack.pop();
        	if(!strs[i].equals(".")&&!strs[i].equals("")&&!strs[i].equals("..")) stack.add(strs[i]);
        }
        if(stack.isEmpty()) return "/";
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
        	sb.insert(0, "/");
        	sb.insert(1,stack.pop());
        }
        return sb.toString();
    }
	
	public static void main(String[] args) {
		Solutions71 s = new Solutions71();
		String path = "/home//foo/";
		System.out.println(s.simplifyPath(path));
	}
}
