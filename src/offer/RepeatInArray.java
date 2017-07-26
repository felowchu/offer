package offer;

public class RepeatInArray {
	public boolean duplicate(int[] numbers, int length, int[] duplication){
		if(numbers.length == 0){
			duplication[0] = -1;
			return false;
		}
		boolean repate = false;
		for(int i = 0; i < numbers.length; ){
			if(numbers[i] == i)
				i++;
			else if(numbers[i] <= length -1){
				if(numbers[i] == numbers[numbers[i]]){
					duplication[0] = numbers[i];
					return true;
				}else{
					int temp = numbers[i];
					numbers[i] = numbers[temp];
					numbers[temp] = temp;
				}
			}else {
				return false;
			}
		}
		return repate;
	}
}
