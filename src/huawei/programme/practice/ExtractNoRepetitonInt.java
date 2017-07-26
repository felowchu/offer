package huawei.programme.practice;

import java.util.Scanner;

public class ExtractNoRepetitonInt {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()){
			int num = sc.nextInt();
			int[] array = new int[10];
			int result = 0;
			while(num != 0){
				int a = num % 10;
				if(array[a] == 0){
					result = result * 10 + a;
					array[a] = 1;
				}
				num /= 10;
			}
			System.out.println(result);
		}
		sc.close();
	}
}
