package offer;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class MaxInSlidingWindow {
	public ArrayList<Integer> maxInWindow(int[] num, int size){
		ArrayList<Integer> maxNum = new ArrayList<Integer>();
		if(num.length >= size && size >= 1){
			ArrayDeque<Integer> window = new ArrayDeque<Integer>();
			
			for(int i = 0; i < size; i++){
				while(!window.isEmpty() && num[i] > num[window.peekLast()])
					window.pollLast();
				window.add(i);
			}
			
			for(int i = size; i < num.length; i++){
				maxNum.add(num[window.peekFirst()]);
				while(!window.isEmpty() && num[i] >= num[window.peekLast()])
					window.pollLast();
				if(!window.isEmpty() && window.peekFirst() <= i - size)
					window.pollFirst();
				window.add(i);
			}
			maxNum.add(num[window.peekFirst()]);
		}
		return maxNum;
	}
}
