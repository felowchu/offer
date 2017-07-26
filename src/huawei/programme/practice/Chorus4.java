package huawei.programme.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Chorus4 {
	public static void main(String[] args) throws FileNotFoundException{
		Scanner sc = new Scanner(new FileInputStream("I:\\a.txt"));
		int total = sc.nextInt()/100;
		int count = sc.nextInt();
		int[][] group = new int[count + 1][3];
		int[][] sum = new int[count + 1][3];
		for(int i = 1; i <= count; i++){
			int price = sc.nextInt()/100;
			int weight = sc.nextInt();
			int flag = sc.nextInt();
			if(flag == 0){group[i][0] = price; sum[i][0] = price * weight;}
			else if(group[flag][1] == 0){group[flag][1] = price; sum[flag][1] = price * weight;}
			else {group[flag][2] = price; sum[flag][2] = price * weight;}
		}
		int[] maxValue = new int[total + 1];
		for(int i = count; i >= 0; i--){
			for(int j = total; j >=1; j--){
				maxValue[j] = maxValue[j];
				if(j >= group[i][0]){
					maxValue[j] = Math.max(maxValue[j], maxValue[j - group[i][0]]+ sum[i][0]);
				}
				if(j >= group[i][0] + group[i][1]){
					maxValue[j] = Math.max(maxValue[j], maxValue[j - group[i][1] - group[i][0]] + sum[i][0] + sum[i][1]);
				}
				if(j >= group[i][0] + group[i][1] + group[i][2]){
					maxValue[j] = Math.max(maxValue[j], maxValue[j - group[i][0] - group[i][1] - group[i][2]] + sum[i][0] + sum[i][1] + sum[i][2]);
				}
			}
		}
		System.out.println(maxValue[total] * 100);
		sc.close();
	}
}
