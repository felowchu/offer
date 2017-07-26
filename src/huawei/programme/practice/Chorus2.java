package huawei.programme.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Chorus2 {
	public static void main(String[] args) throws FileNotFoundException{
		Scanner sc = new Scanner(new FileInputStream("I:\\a.txt"));
		int total = sc.nextInt()/100;
		int count = sc.nextInt();
		int[][] group = new int[count + 1][3];
		int[][] maxValue = new int[count + 1][total + 1];
		int[][] sum = new int[count + 1][3];
		for(int i = 1; i <= count; i++){
			int price = sc.nextInt()/100;
			int weight = sc.nextInt();
			int flag = sc.nextInt();
			if(flag == 0){group[i][flag] = price; sum[i][flag] = price * weight;}
			else if(group[flag][1] == 0){group[flag][1] = price; sum[flag][1] = price * weight;}
			else{group[flag][2] = price * weight; sum[flag][2] = price * weight;}
		}
		for(int i = 1; i <= count; i++){
			for(int j = 1; j <= total; j++){
				maxValue[i][j] = maxValue[i - 1][j];
				if(j >= group[i][0])
					maxValue[i][j] = Math.max(maxValue[i][j], maxValue[i - 1][j - group[i][0]] + sum[i][0]);
				if(j >= group[i][0] + group[i][1])
					maxValue[i][j] = Math.max(maxValue[i][j], maxValue[i - 1][j - group[i][0] - group[i][1]] + sum[i][0] + sum[i][1]);
				if(j >= group[i][0] + group[i][1] + group[i][2]){
					int t = maxValue[i - 1][j - group[i][0] - group[i][1] - group[i][2]] + sum[i][0] + sum[i][1] + sum[i][2];
					if(t > maxValue[i][j])
						maxValue[i][j] = t;
				}
			}
		}
		System.out.println(maxValue[count][total] * 100);
		sc.close();
	}
}
