package huawei.programme.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ShoppingList {
	public static void main(String[] args) throws FileNotFoundException{
		Scanner sc = new Scanner(new FileInputStream("I:\\a.txt"));
		int total = sc.nextInt()/10;
		int count = sc.nextInt();
		int[] price = new int[count + 1];
		int[] weight = new int[count + 1];
		int[] p = new int[count + 1];
		for(int i = 1; i <= count; i++){
			price[i] = sc.nextInt()/10;
			weight[i] = sc.nextInt();
			p[i] = sc.nextInt();
		}
		int result = getMaxValue(price, weight, p, count, total);
		System.out.println(result);
		sc.close();
	}
	
	public static int getMaxValue(int[] price, int[] weight, int[] p, int count, int total){
		int[][] maxValue = new int[count + 1][total + 1];
		int[] sum = new int[count + 1];
		for(int i = 1; i <= count; i++){
			sum[i] = price[i] * weight[i];
		}
		for(int i = 1; i <= count; i++){
			for(int j = 1; j <= total; j++){
				if(p[i] == 0){
					if(j >= price[i]){
						maxValue[i][j] = Math.max(maxValue[i-1][j], maxValue[i - 1][j - price[i]] + sum[i]);
					}else{
						maxValue[i][j] = maxValue[i - 1][j];
					}
				}else{
					if(j >= price[i] + price[p[i]]){
						maxValue[i][j] = Math.max(maxValue[i - 1][j], maxValue[i - 1][j - price[i] - price[p[i]]] + sum[i] + sum[p[i]]);
					}
				}
			}
		}
		return maxValue[count][total] * 10;
	}
}
