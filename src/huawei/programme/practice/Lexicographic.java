package huawei.programme.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Lexicographic {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		ArrayList<String> list = new ArrayList<String>();
		for(int i = 0; i < count; i++)
			list.add(sc.nextLine());
		Collections.sort(list);
		for(int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));
		sc.close();
	}
}
