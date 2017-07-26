package huawei.programme.practice;

import java.util.Scanner;

public class ReversalString {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()){
			String str = sc.nextLine();
			char[] array = str.toCharArray();
			int i = 0;
			int j = str.length() - 1;
			while(j > i){
				char temp = array[j];
				array[j] = array[i];
				array[i] = temp;
				i++;
				j--;
			}
			System.out.println(new String(array));
		}
		sc.close();
	}
}
