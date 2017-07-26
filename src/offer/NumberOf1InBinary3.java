package offer;
/*计算某个整数二进制表示中1的个数
 * 可以计算负整数的情况，且循环次数与整数中1的个数相同
 * */
public class NumberOf1InBinary3 {
	public static void main(String[] args){
		System.out.println(numberOf1(25));
	}
	public static int numberOf1(int n){
		int count = 0;
		while(n != 0){
			count++;
			n = n & (n-1);
		}
		return count;
	}
}
