package offer;
/*打印1到最大的N位数
 * 只考虑int范围内的数
 * */
public class Print1ToMaxOfNDigits1 {
	public static void main(String[] args){
		printNumber(5);
	}
	
	public static void printNumber(int n){
		int max = (int) Math.pow(10, n);
		for(int i = 1; i < max; i++){
			System.out.println(i);
		}
	}
}
