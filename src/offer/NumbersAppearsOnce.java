package offer;

public class NumbersAppearsOnce {
	public void FindOnlyOnce(int[] array, int[] num1, int[] num2){
		if(array.length == 0)
			return;
		int result = 0;
		for(int i = 0; i < array.length; i++){
			result ^= array[i];
		}
		int bitIndix = findFirst1(result);
		num1[0] = num2[0] = 0;
		for(int i = 0; i < array.length; i++){
			if(isBit1(array[i],bitIndix))
				num1[0] ^= array[i];
			else
				num2[0] ^= array[i];
		}
	}
	public int findFirst1(int num){
		int bitIndex = 0;
		while((num & 1) == 0 && bitIndex < 32){
			num = num >> 1;
			bitIndex++;
		}
		return bitIndex;
	}
	public boolean isBit1(int num, int bitIndex){
		num = num >> bitIndex;
		return (num & 1) == 0;
	}
}
