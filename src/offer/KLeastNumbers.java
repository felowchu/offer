package offer;

import java.util.ArrayList;

public class KLeastNumbers {
	public ArrayList<Integer> getLeastNumber(int[] input, int k){
		ArrayList<Integer> output = new ArrayList<Integer>();
		if(input.length == 0 || k <= 0 || input.length < k)
			return output;
		int start = 0;
		int end = input.length - 1;
		int index = partition(input, start, end);
		while(index != k-1){
			if(index > k-1){
				end = index - 1;
				index = partition(input, start, end);
			}else{
				start = index + 1;
				index = partition(input, start, end);
			}
		}
		for(int i = 0; i < k; i++){
			output.add(input[i]);
		}
		return output;
	}
	
	public int partition(int[] array, int start, int end){
		int key = array[start];
		int small = start;
		for(int large = start+1; large < end; large++){
			if(array[large] < key){
				int temp = array[large];
				array[large] = array[small+1];
				array[small+1] = temp;
				small++;
			}
		}
		array[start] = array[small];
		array[small] = key;
		return small;
	}
}
