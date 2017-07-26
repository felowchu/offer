package huawei.programme.practice;

import java.util.Scanner;

public class Chorus {
	public static void getSubQueueLenngth(int[] queue, int[] num){
		for(int i = 1; i < queue.length; i++){
			for(int j = i - 1; j >= 0; j--){
				if(queue[i] > queue[j] && num[i] < num[j] + 1)
					num[i] = num[j] + 1;
			}
		}
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] queue = new int[n];
		for(int i = 0; i < n; i++){
			queue[i] = sc.nextInt();
		}
		int[] inNum = new int[n];
		int[] deNum = new int[n];
		for(int i = 0; i < n; i++){
			inNum[i] = 1;
			deNum[i] = 1;
		}
		getSubQueueLenngth(queue, inNum);
		int index1 = 0;
		int index2 = n - 1;
		while(index2 > index1){
			int temp = queue[index2];
			queue[index2] = queue[index1];
			queue[index1] = temp;
			index1++;
			index2--;
		}
		getSubQueueLenngth(queue, deNum);
		int maxLength = 0;
		for(int i = 0; i < n; i++){
			if(inNum[i] + deNum[n-1-i] > maxLength)
				maxLength = inNum[i] + deNum[n-1-i];
		}
		System.out.println(n - maxLength + 1);
		sc.close();
	}
}
