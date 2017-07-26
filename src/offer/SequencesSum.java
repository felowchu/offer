package offer;

import java.util.ArrayList;

public class SequencesSum {
	public ArrayList<ArrayList<Integer>> FindContinusSequences(int sum){
		ArrayList<Integer> sequence = new ArrayList<Integer>();
		ArrayList<ArrayList<Integer>> sequences = new ArrayList<ArrayList<Integer>>();
		if(sum < 3)
			return sequences;
		
		int small = 1;
		int big = 2;
		int mid = (1+sum)/2;
		int cSum = big+small;
		while(small < mid){
			if(cSum == sum){
				sequence = SequenceSum(small, big);
				sequences.add(new ArrayList<Integer>(sequence));
			}
			while(cSum > sum && small < mid){
				cSum -= small;
				small++;
				if(cSum == sum){
					sequence = SequenceSum(small, big);
					sequences.add(new ArrayList<Integer>(sequence));
				}
			}
			big++;
			cSum += big;
		}
		return sequences;
	}
	public ArrayList<Integer> SequenceSum(int small, int large){
		ArrayList<Integer> sequence = new ArrayList<Integer>();
		for(int i = small; i <= large; i++){
			sequence.add(i);
		}
		return sequence;
	}
}
