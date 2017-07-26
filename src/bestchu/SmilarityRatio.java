package bestchu;

import java.util.Scanner;

public class SmilarityRatio {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String symbol = sc.nextLine();
		String star = sc.nextLine();
		String transform = "";
		int count = 0;
		for(int i = 0 ; i < symbol.length(); i++){
			char c = symbol.charAt(i);
			if((c >= '0' && c <= '9') || (c >= 'A' && c <= 'Z') || (c >= 'a' && c<= 'z')){
				transform += '1';
			}else{
				transform += '0';
			}
		} 
		
		for(int i = 0; i < star.length(); i++){
			if(transform.charAt(i) == star.charAt(i)) count++;
		}
		
		double ratio = (double)count/(double)star.length()*100;
		
		System.out.printf("%.2f", ratio);
		System.out.print("%");
		
		sc.close();
	}
}
