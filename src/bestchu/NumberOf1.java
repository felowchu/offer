package bestchu;


public class NumberOf1 {
	public static void main(String[] args){
		int n = 17895687;
		System.out.println(number(n));
	}
	
	public static int number(int n){
		int num = 0;
		for(int i = 1; i < n; i *= 10){
			int a = n/i;
			int b = n%i;
			
			num = (a+8)/10*i+((a%10 == 1) ? b+1 : 0);
		}
		return num;
	}
}
