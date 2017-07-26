package offer;

public class Power1 {
	public double power(double base, int exponent){
		if(Math.abs(base - 0) < 0.000001 && exponent == 0){
			return 0.0;
		}
		
		int absExponent = Math.abs(exponent);
		double result = 1.0;
		for(int i = 0; i < absExponent; i++){
			result *= base;
		}
		if(exponent < 0){
			result = 1.0/result;
		}
		return result;
	}
}
