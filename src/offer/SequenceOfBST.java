package offer;

import java.util.Arrays;

public class SequenceOfBST {
	public boolean VerifySequenceOfBST(int[] sequence){
		if(sequence.length == 0)
			return false;
		int length = sequence.length;
		int root = sequence[length-1];
		
		int i = 0;
		for(;i < length-1; i++){
			if(sequence[i] > root)
				break;
		}
		int j = i;
		for(;j < length-1; j++){
			if(sequence[j] < root)
				return false;
		}
		boolean left = true;
		if(i > 0){
			left = VerifySequenceOfBST(Arrays.copyOfRange(sequence, 0, i));
		}
		boolean right = true;
		if(i < length -1){
			right = VerifySequenceOfBST(Arrays.copyOfRange(sequence, i, length-1));
		}
		return left&&right;
	}
}
