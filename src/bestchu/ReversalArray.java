package bestchu;

import java.util.Scanner;

public class ReversalArray {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int[] primeArray = new int[len];
		for(int i = 0; i < len ; i++){
			primeArray[i] = sc.nextInt();
		}
		String flag = existSegment(primeArray);;
		System.out.println(flag);
		sc.close();
	}
	
	public static String existSegment(int[] array){
		String result = "no";
		int smaller = 0;
		int lager = 0;
		boolean f = false;
		if(array == null)  return "no";
		if(array.length == 1) return "yes";
		
		for(int i = 1; i < array.length; i++){
			if(array[i] < array[i-1] && result.equals("no")){
				if( i == 1){
					smaller = Integer.MIN_VALUE;
				}else{
					smaller = array[i - 2];
				}
				lager = array[i-1];
				result = "yes";
				continue;
			}
			if(array[i] > array[i-1] && result.equals("yes")){
				if(array[i] < lager || array[i-1] < smaller){
					System.out.println(1);
					return "no";
				}else{
					f = true;
				}
			}
			if(array[i] < array[i-1] && f){
				return "no";
			}
		}
		return result;
	}
}
