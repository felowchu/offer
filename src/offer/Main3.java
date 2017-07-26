package offer;

import java.util.HashSet;
import java.util.Scanner;

public class Main3 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		HashSet<Long> uid = new HashSet<Long>();
		String s = sc.nextLine();
		Long l = new Long(s);
		while(l != 0){
			uid.add(l);
			s = sc.nextLine();
			l = new Long(s);
		}
		System.out.println(uid.size());
		sc.close();
	}
}
