package huawei.programme.practice;

import java.util.Scanner;

public class HexToDex {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()){
			String hex = sc.nextLine();
			hex = hex.substring(2, hex.length());
			System.out.println(Integer.parseInt(hex,16));
		}
		sc.close();
	}
}

