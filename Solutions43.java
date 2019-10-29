package main.cczq.zrh;
/*
 * 给定两个以字符串形式表示的非负整数 num1 和 num2，返回 num1 和 num2 的乘积，它们的乘积也表示为字符串形式。

示例 1:

输入: num1 = "2", num2 = "3"
输出: "6"
*/
public class Solutions43 {
	private String res = new String();
	public String multiply(String num1, String num2) {
		if(num1.equals("0")||num2.equals("0")) return "0";
        for(int i=num2.length()-1;i>=0;i--) {
        	int carry = 0;
        	StringBuilder sb= new StringBuilder();
        	for(int k=0;k<num2.length()-1-i;k++) {
        		sb.append("0");
        	}
        	int multi = num2.charAt(i)-'0';
        	for(int j=num1.length()-1;j>=0||carry!=0;j--) {
//        		运用了ascii码的知识
        		int cand = j<0?0:num1.charAt(j)-'0';
        		int residue = (carry+cand*multi)%10;
        		sb.append(residue);
        		carry = (carry+cand*multi)/10;
        	}
        	res = addString(res, sb.reverse().toString());
        }
        return res;
    }
	public String addString(String s1, String s2){
		int carry=0;
		StringBuilder sb = new StringBuilder();
		for(int i=s1.length()-1,j=s2.length()-1;i>=0||j>=0||carry!=0;i--,j--) {
			int n1 = i<0?0:s1.charAt(i)-'0';
			int n2 = j<0?0:s2.charAt(j)-'0';
			int residue = (carry+n1+n2)%10;
			sb.append(residue);
			carry = (carry+n1+n2)/10;
			
		}
		return sb.reverse().toString();
	}
	public static void main(String[] args) {
		Solutions43 s = new Solutions43();
		System.out.println(s.multiply("123456789", "987654321"));
		
	}
}
