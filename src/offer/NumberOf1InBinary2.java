package offer;
/*计算某个二进制整数中1的个数，
 * 可计算负整数的情况，循环次数为32*/
public class NumberOf1InBinary2 {
	public static void main(String[] args){
		System.out.println(numberOf1(-56));
	}
	public static int numberOf1(int n){
		int count = 0;
		int flag = 1;
		while(flag > 0){
			if((n&flag) > 0){
				count++;
			}
			flag = flag << 1;
		}
		return count;
	}
}
