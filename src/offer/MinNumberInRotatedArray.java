package offer;

import java.util.NoSuchElementException;

public class MinNumberInRotatedArray {
	public int minNumberInRotatedArray(int[] array){
		if(array.length  == 0)
			throw new NoSuchElementException();
		
		int index1 = 0;
		int index2 = array.length-1;
		int mid = 0;
		while(array[index1] >= array[index2]){
			if(index2 - index1 == 1){
				mid = index2;
				break;
			}
			mid = (index1+index2)/2;
			if(array[index1] == array[mid] && array[mid] == array[index2]){
				return minInOrder(array, index1, index2);
			}
			if(array[mid] >= array[index1]){
				index1 = mid;
			}else if(array[mid] <= array[index2]){
				index2 = mid;
			}
		}
		return array[mid];
	}
	
	public static int minInOrder(int[] array,int index1, int index2){
		int result = array[index1];
		for(int i = index1 + 1; i <= index2; i++){
			if(array[i] < result)
				result = array[i];
		}
		return result;
	}
}
