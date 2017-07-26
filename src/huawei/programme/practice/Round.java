package huawei.programme.practice;

import java.util.Scanner;

public class Round {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()){
			double num = sc.nextDouble();
			System.out.println(Math.round(num));
		}
		sc.close();
	}
}
