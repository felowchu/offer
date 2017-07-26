package huawei.programme.practice;

import java.util.Scanner;

public class StaticNumberOfChar {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()){
			String str = sc.nextLine();
			int nums = 0;
			int[] count = new int[128];
			for(int i = 0; i < str.length(); i++){
				if(str.charAt(i) < 127){
					if(count[str.charAt(i)] == 0)
						nums++;
					count[str.charAt(i)]++;
				}
			}
			System.out.println(nums);
		}
		sc.close();
	}
}
