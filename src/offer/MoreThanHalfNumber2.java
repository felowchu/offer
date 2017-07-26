package offer;

public class MoreThanHalfNumber2 {
	public int moreThanHalfNumber(int[] array){
		if(array.length == 0)
			return 0;
		int result = 0;
		int times = 0;
		for(int i = 0; i < array.length; i++){
			if(times == 0){
				result = array[i];
				times = 1;
			}else if(array[i] == result){
				times++;
			}else{
				times--;
			}
		}
		if(!MoreThanHalf(array, result)){
			return 0;
		}
		return result;
	}
	public boolean MoreThanHalf(int[] array, int result){
		boolean isValid = true;
		int count = 0;
		for(int i = 0; i < array.length; i++){
			if(array[i] == result)
				count++;
		}
		if(count*2 <= array.length)
			isValid = false;
		return isValid;
	}
}
