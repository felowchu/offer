package offer;

public class NumberOf1Between1AndN {
	public static void main(String[] args){
		System.out.println(numberOf1(1512));
	}
	public static int numberOf1(int n){
		int count = 0;
		for(int i = 1; i <= n; i=i*10){
			int a = n%i; 
			int b = n/i;
			count += (b+8)/10*i + (b%10 == 1 ? (a+1) : 0);
		}
		return count;
	}
}
