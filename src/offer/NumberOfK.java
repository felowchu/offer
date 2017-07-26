package offer;

public class NumberOfK {
	public int GetNumberOfK(int[] array, int k){
		if(array.length == 0)
			return -1;
		int number = 0;
		int first = GetFirstK(array, k, 0, array.length - 1);
		int last = GetLastK(array, k, 0, array.length - 1);
		if(first > -1 && last > -1)
			number = last - first + 1;
		return number;
	}
	
	public int GetFirstK(int[] array, int k, int start, int end){
		if(start > end)
			return -1;
		int mid = (start+end)/2;
		if(array[mid] == k){
			if((mid > 0 && array[mid - 1] < k) || mid == 0)
				return mid;
			else 
				end = mid - 1;
		}else if(array[mid] > k)
			end = mid - 1;
		else 
			start = mid + 1;
		return GetFirstK(array, k, start, end);
	}
	
	public int GetLastK(int[] array, int k, int start, int end){
		if(start > end)
			return -1;
		int mid = (start + end)/2;
		if(array[mid] == k){
			if((mid < array.length-1 && array[mid + 1] > k) || mid == array.length -1){
				return mid;
			}
			else
			start = mid + 1;
		}
		else if(array[mid] < k)
			start = mid + 1;
		else 
			end = mid - 1;
		return GetLastK(array, k, start, end);
	}
}
