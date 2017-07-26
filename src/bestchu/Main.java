package bestchu;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int in = sc.nextInt();
		
		int i = 2;
		
		int mul = 1;
		
		while(in >= 0){
			if(in - i > i)
			in  = in - i;
			else break;
			i++;
		}
		
		int flag = in-i;
		
		for(int j = 2; j <= i; j++){
			if(j <= i - flag)
			mul *= j;
			else   mul*=(j+1);
		}
		
		System.out.println(in);
		
		System.out.println(mul);
		
		sc.close();
	}
}
