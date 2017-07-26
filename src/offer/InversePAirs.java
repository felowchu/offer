package offer;

public class InversePAirs {
	public static void main(String[] args){
		int[] number = {1,2,3,4,5,6,7,0};
		System.out.println(inversePair(number));
	}
	public static int[] copy;
	public static int inversePair(int[] array){
		if(array.length == 0)
			return 0;
		copy = new int[array.length];
		for(int i = 0; i < array.length; i++){
			copy[i] = array[i];
		}
		int count = countOfPair(array,0,array.length-1);
		return count;
	}
	
	public static int countOfPair(int[] array, int start, int end){
		if(start == end){
			return 0;
		}
		int length = (end - start)/2;
		int left = countOfPair(array, start, start+length);
		int right = countOfPair(array, start+length+1, end);
		int p1 = start+length;
		int p2 = end;
		int indexCopy = end;
		int count = 0;
		while(p1 >= start && p2 >= start+length+1){
			if(array[p1] > array[p2]){
				copy[indexCopy--] = array[p1--];
				count += p2 - start - length;
				if(count > 1000000007)
					count -= 1000000007;
			}else{
				copy[indexCopy--] = array[p2--];
			}	
		}
		for(;p1>=start;p1--)
			copy[indexCopy--] = array[p1];
		for(;p2>=start+length+1;p2--)
			copy[indexCopy--] = array[p2];
		for(int i = start; i <= end; i++)
			array[i] = copy[i];
		return left+right+count;
	}
}
