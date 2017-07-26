package offer;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String  s  = sc.next();
		int n = s.length();
		int count = 0;
		String temp=s;
		
		if(n == 1){
			System.out.println(1);
		}else{
			for(int x = 0; x < n; x++){
				String s1 = temp.substring(1, n) + temp.substring(0,1);
				if(s1.equals(s)){
					count++;
				}
				temp = s1;
			}
			System.out.println(count);
		}
		sc.close();
	}
}
