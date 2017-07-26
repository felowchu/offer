package offer;

import java.util.Arrays;

public class Straight {
	public boolean isContinuous(int[] numbers){
		if(numbers.length == 0)
			return false;
		Arrays.sort(numbers);
		
		int numOfZero = 0;
		int numOfGap = 0;
		for(int i = 0; i < numbers.length && numbers[i] == 0; i++){
			if(numbers[i] == 0)
				numOfZero++;
		}
		int small = numOfGap;
		int big = 1;
		while(big < numbers.length){
			if(numbers[big] == numbers[small])
				return false;
			numOfGap += (numbers[big] - numbers[small] - 1);
			if(numOfGap > numOfZero){
				return false;
			}
			small = big;
			big++;
		}
		return true;
	}
}
