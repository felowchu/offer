package huawei.programme.practice;

import java.util.Scanner;

public class PrimerDivisor {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()){
			String str = sc.nextLine();
			long num = Long.parseLong(str);
			Long i = 2L;
			String result = "";
			while(i <= num){
				while(num % i == 0){
					num /= i;
					result += i + " ";
				}
				i++;
			}
			System.out.println(result);
		}
		sc.close();
	}
}
