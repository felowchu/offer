package offer;
/*使用partition找出数组中出现次数超过一半的数字，需要改变原来数组的值*/
public class MoreThanHalfNumber {
	public static void main(String[] args){
		int[] number = {1,2,3,2,2,2,5,4,2};
		System.out.println(moreThanHalfNumber(number));
	}
	public static int moreThanHalfNumber(int[] number){
		if(number.length == 0)
			return 0;
		int len = number.length;
		int start = 0;
		int end = len - 1;
		int index = partition(number,start,end);
		int middle = len >> 1;
		while(index != middle){
			if(index < middle){
				start = index + 1; 
				index = partition(number, start, end);
			}
			else{
				end = index - 1;
				index = partition(number, start, end);
			}
		}
		int result = number[middle];
		if(!CheckValidNumber(number,result))
			return 0;
		return result;
	}
	
	public static int partition(int[] number, int start, int end){
		int key = number[start];
		int small = start;
		
		for(int big = start + 1; big < end; big++){
			if(number[big] < key){
				int temp = number[big];
				number[big] = number[small+1];
				number[small+1] = temp;
				small++;
			}
		}
		number[start] = number[small];
		number[small] = key;
		return small;
	}
	public static boolean CheckValidNumber(int[] number, int result){
		int count = 0;
		boolean isValid = true;
		for(int i = 0; i < number.length; i++){
			if(number[i] == result)
				count++;
		}
		if(count*2 <= number.length)
			isValid = false;
		return isValid;
	}
}
