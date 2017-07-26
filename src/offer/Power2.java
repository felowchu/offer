package offer;

public class Power2 {
	public double Power(double base, int exponent){
		if(Math.abs(base - 0.0)<0.00001 && exponent <0){
			return 0.0;
		}
		double result = 1.0;
		int absExponent = Math.abs(exponent);
		result = unsignedPower(base, absExponent);
		if(exponent < 0){
			result = 1.0/result;
		}
		return result;
	}
	
	public static double unsignedPower(double base, int exponent){
		double result = 1;
		if(exponent == 0)
			return 1;

		result = unsignedPower(base, exponent>>1);
		result *= result;
		if((exponent & 1) == 1)
			result *= base;
		
		return result;
	}
}
