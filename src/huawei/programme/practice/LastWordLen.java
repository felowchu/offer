package huawei.programme.practice;

import java.util.Scanner;

public class LastWordLen {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] strings = str.split(" ");
		System.out.println(strings[strings.length - 1].length());
		sc.close();
	}
}
