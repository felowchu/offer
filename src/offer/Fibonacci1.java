package offer;

public class Fibonacci1 {
	public static void main(String[] args){ 
		int n = 39;
		System.out.println(fibonacci(n));
	}
	public static int fibonacci(int n){
		
		if(n == 0)
			return 0;
		if(n == 1)
			return 1;
		
		return fibonacci(n-1)+fibonacci(n-2);
	}
}
