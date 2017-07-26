package bestchu;
import java.util.LinkedList;

public class Sort {
	public static void main(String[] args){
		int[] a = {6,4,21,53,65,32,23,13,78,43};
//		LinkedList<Integer> sortList = new LinkedList<Integer>();
//		sortList = insertSort1(a);
//		for(int i = 0; i < sortList.size(); i++){
//			System.out.print(sortList.get(i)+" ");
//		}
		insertSorted2(a);
		for(int i = 0; i < a.length; i++){
			System.out.print(a[i]+" ");
		}
	}
	public static void bubbleSort(int[] numbers){
		boolean isSwitched;
		do{
			isSwitched = false;
			for(int i = 0; i < numbers.length - 1; i++){
				if(numbers[i+1] < numbers[i]){
					int temp = numbers[i];
					numbers[i] = numbers[i+1];
					numbers[i+1] = temp;
					isSwitched = true;
				}
			}
		}while(isSwitched);
	}
	
	public static LinkedList<Integer> insertSort1(int[] numbers){
		LinkedList<Integer> sortedList = new LinkedList<Integer>();
		OriginalList: for(int number : numbers){
			for(int i = 0; i < sortedList.size(); i++){
				if(number < sortedList.get(i)){
					sortedList.add(i,number);
					continue OriginalList;
				}
			}
			sortedList.add(sortedList.size(), number);
		}
		return sortedList;
	}
	
	public static void insertSorted2(int[] numbers){
		for(int i = 1; i < numbers.length; i++){
			int temp = numbers[i];
			int j = i - 1;
			while(j >= 0 && temp < numbers[j]){
				numbers[j+1] = numbers[j];
				j--;
			}
			numbers[j+1] = temp;
		}
	}
}
