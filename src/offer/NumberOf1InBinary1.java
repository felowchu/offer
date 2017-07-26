package offer;

/*计算某整数二进制表示中1的个数
*该整数位正整数
*/
public class NumberOf1InBinary1 {
	public static void main(String[] args){
		System.out.println(numberOf1(125));
	}
	public static int numberOf1(int n){
		int count = 0;
		while(n > 0){
			if((n&1) == 1){
				count++;
			}
			n = n >> 1;
		}
		return count;
	}
}
