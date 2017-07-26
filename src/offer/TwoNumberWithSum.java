package offer;

import java.util.ArrayList;

public class TwoNumberWithSum {
	public ArrayList<Integer> FindNumbersWithSum(int[] array, int sum){
		ArrayList<Integer> twoNum = new ArrayList<Integer>();
		if(array.length <= 1)
			return twoNum;
		int ahead = array.length - 1;
		int behind = 0;
		while(ahead > behind){
			int cSum = array[ahead] + array[behind];
			if(cSum == sum){
				twoNum.add(array[behind]);
				twoNum.add(array[ahead]);
				break;
			}else if(cSum > sum)
				ahead --;
			else 
				behind++;
		}
		return twoNum;
	}
}
