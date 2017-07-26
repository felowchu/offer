package offer;

public class Fibonacee2 {
	public int fibonicce(int n){
		if(n == 0)
			return 0;
		if(n == 1)
			return 1;
		int fibZero = 0;
		int fibOne = 1;
		int fibN = 0;
		for(int i = 2; i <= n; i++){
			fibN = fibZero + fibOne;
			fibZero = fibOne;
			fibOne = fibN;
		}
		return fibN;
	}
}
