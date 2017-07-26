package huawei.programme.practice;

import java.util.Scanner;

public class DivideString {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextLine()) {
			String firstLine = sc.nextLine();
			if(firstLine.length()%8 != 0)
				firstLine += "00000000";
			while(firstLine.length() >= 8){
				System.out.println(firstLine.substring(0,8));
				firstLine = firstLine.substring(8);
			}
		}
		sc.close();
	}
}
