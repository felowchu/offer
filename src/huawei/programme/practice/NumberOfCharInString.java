package huawei.programme.practice;

import java.util.Scanner;

public class NumberOfCharInString {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String string = sc.nextLine();
		String key = sc.nextLine();
		int count = 0;
		if(string == null || key == null)
			System.out.println(0);
		else{
			for(int i = 0; i < string.length(); i++){
				if(string.substring(i,i+1).equalsIgnoreCase(key))
					count++;
			}
		}
		System.out.println(count);
		sc.close();
	}
}
