package bestchu;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Demo4 {
	public static void main(String[] args) throws FileNotFoundException{
		FileInputStream fis = new FileInputStream("I:\\num.txt");
		Scanner sc = new Scanner(fis);
		int count = 0;
		while(sc.hasNext()){
			int i = sc.nextInt();
			count++;
			System.out.print(i+ " ");
			if(count%40 == 0)
				System.out.println();
		}
		System.out.println(count);
		sc.close();
	}
}
