package offer;

public class GreatSumOfSubArray {
	public int findGreatSum(int[] array){
		if(array.length == 0)
			return 0;
		int sum = 0;
		int GreatSum = Integer.MIN_VALUE;
		for(int i = 0; i < array.length; i++){
			if(sum <= 0)
				sum = array[i];
			else
				sum += array[i];
			if(sum > GreatSum)
				GreatSum = sum;
		}
		return GreatSum;
	}
}
