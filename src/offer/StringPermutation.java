package offer;

import java.util.ArrayList;
import java.util.Collections;

public class StringPermutation {
	ArrayList<String> as = new ArrayList<String>();
	public ArrayList<String> Permutation(String str){
		if(str.length() == 0)
			return as;
		char[] al = str.toCharArray();
		int index = 0;
		permutationChar(index, al);
		Collections.sort(as);
		return as;
	}
	
	public void permutationChar(int index, char[] al){
		if(index == al.length-1)
			as.add(new String(al));
		else{ 
			for(int i = index; i < al.length; i++){
				if (isswap(al, index, i)) {
					char temp = al[i];
					al[i] = al[index];
					al[index] = temp;
					permutationChar(index + 1, al);
					temp = al[i];
					al[i] = al[index];
					al[index] = temp;
				}
			}
		}
	}
	
	public boolean isswap(char[] al,int index, int i){
		for(int j = index; j < i; j++){
			if(al[j] == al[i]){
				return false;
			}
		}
		return true;
	}
}
