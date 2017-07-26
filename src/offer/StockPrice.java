package offer;

import java.util.ArrayList;
import java.util.Scanner;


public class StockPrice {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> day = new ArrayList<Integer>();
		while(sc.hasNext()){
			int d = sc.nextInt();
			day.add(d);
		}
		for(int i = 0; i < day.size(); i++){
			int downDateCount = 0;
			int date = day.get(i);
			int downDate = 0;
			while(downDate < date){
				downDateCount++;
				downDate = downDateCount*(downDateCount+1)/2;
				if(date == downDate){
					System.out.println(date - 2*(--downDateCount));
					break;
				}
				if(date < downDate){
					downDateCount = downDateCount - 2;
					System.out.println(date - 2*downDateCount);
					break;
				}
			}
		}
		sc.close();
	}
}
