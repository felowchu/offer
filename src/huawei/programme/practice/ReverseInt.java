package huawei.programme.practice;

import java.util.Scanner;

public class ReverseInt {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNextLine()){
			int num = scanner.nextInt();
			String str = "";
			while(num != 0){
				int a = num % 10;
				str += a;
				num /= 10;
			}
			System.out.println(str);
		}
		scanner.close();
	}
}
