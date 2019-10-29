package main.cczq.zrh;
/*说明:

-100.0 < x < 100.0
n 是 32 位有符号整数，其数值范围是 [−2^31, 2^31 − 1] 。*/
public class Solutions50 {
//	public double myPow(double x, int n) {
//        double ans = 1;
//        for(int i=0;i<Math.abs(n);i++) {
//        	ans = ans*x;
//        }
//        if(n<0) ans=1/ans;
//        return ans;
//    }
	public double myPow(double x, int n) {
		if(n<0) {
			x=1/x;
			n = -n;
		}
		return fashPow(x, n);
	}
	public double fashPow(double x,int n) {
		if(n==0) return 1;
		double half = fashPow(x, n/2);
		if(n%2==0) {
			return half*half;
		}else {
			return half*half*x;
		}
	}
	public static void main(String[] args) {
		Solutions50 solutions50 = new Solutions50();
		System.out.println(solutions50.myPow(2, -3));
	}
}
