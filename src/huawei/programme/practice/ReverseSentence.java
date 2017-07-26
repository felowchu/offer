package huawei.programme.practice;

import java.util.Scanner;

public class ReverseSentence {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
			String str = sc.nextLine();
			String temp = "";
			String result = "";
			for(int i = 0; i < str.length(); i++){
				if(str.charAt(i) == ' '){
					result = " " + temp + result;
					temp = "";
				}
				else
					temp += str.charAt(i);
			}
			if(temp.length() > 0)
				result = temp + result;
			System.out.println(result);
		
		sc.close();
	}
}
