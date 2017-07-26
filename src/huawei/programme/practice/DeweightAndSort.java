package huawei.programme.practice;

import java.util.Scanner;
import java.util.TreeSet;

public class DeweightAndSort {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		TreeSet<Integer> NoRepetitionNum = new TreeSet<Integer>();
		while (sc.hasNext()) {
			while (count > 0) {
				NoRepetitionNum.add(sc.nextInt());
				count--;
			}
			for (Integer i : NoRepetitionNum)
				System.out.println(i);
		}
		sc.close();
	}
}
