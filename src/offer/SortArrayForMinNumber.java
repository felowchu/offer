package offer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortArrayForMinNumber {
	public static void main(String[] args){
		int[] numbers = {3,32,321};
		System.out.println(PrintMinNumber(numbers));
	}
	public static String PrintMinNumber(int[] numbers){
		if(numbers.length == 0)
			return "0";
		ArrayList<String> aList = new ArrayList<String>();
		for(int i = 0; i < numbers.length; i++){
			aList.add(String.valueOf(numbers[i]));
		}
		String s = "";
		Collections.sort(aList,new MC());
		for(int i = 0; i < aList.size(); i++){
			s += aList.get(i);
		}
		return s;
	}
	public static class MC implements Comparator<String>{

		public int compare(String s1, String s2) {
			String temp1 = s1 + s2;
			String temp2 = s2 + s1;
			return temp1.compareTo(temp2);
		}
	}
}
