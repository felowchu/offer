package offer;

import java.util.HashSet;
import java.util.Scanner;

public class Main1 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		HashSet<Integer> hSet = new HashSet<Integer>();
		for(int i = 0; i < m; i++){
			hSet.add(sc.nextInt());
		}
		
		int n = sc.nextInt();
		HashSet<Integer> hSet2 = new HashSet<Integer>();
		for(int i = 0; i < n; i++){
			int temp = sc.nextInt();
			if(hSet2.add(temp) && !hSet.add(temp))
				System.out.print(temp+" ");
		}
		sc.close();
	}
}
