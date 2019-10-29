package main.cczq.zrh;

public class Solutions29 {
	public int divide(int dividend, int divisor) {
        int sign = 1;
        if((dividend>0 && divisor<0)||(dividend<0 && divisor>0)){
            sign = -1;
        }
//        if(dividend==-2147483648)
//        	dividend =  (1<<31)-1;
        long count = 0;
        long result = 0;
        long x = Math.abs((long)dividend);
        long y = Math.abs((long)divisor);
        while(x>=y) {
        	y=y<<1;
        	count+=1;
        }
        while(count>0) {
        	y=y>>1;
        	if(x>=y) {
        		result+=1<<(count-1);
//        		if(result==Integer.MIN_VALUE) 
        		x-=y;
        	}
        	count -=1;
        }
        if(sign==-1) result=-result;
        if(result<=Integer.MIN_VALUE) return Integer.MIN_VALUE; 
        if(result>=Integer.MAX_VALUE) return Integer.MAX_VALUE;
        return (int)result;
    }
	
	public static void main(String[] args) {
		Solutions29 solutions29 = new Solutions29();
		System.out.println(solutions29.divide(-2147483648,-1));
	}
}
