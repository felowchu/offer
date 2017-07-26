package huawei.programme.practice;

import java.util.Scanner;

public class FinalWordLength {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String sentences = sc.nextLine();
		if(sentences == null)
			System.out.println(0);
		else{
			String[] allWords = sentences.split(" ");
			System.out.println(allWords[allWords.length - 1].length());
		}
		sc.close();
	}
}
