package bestchu;

import java.util.ArrayList;


public class LongestSubstring {
	public static void main(String[] args){
		String s = "pwwkewadefg";
		LongestSubstring ls = new LongestSubstring();
		int i = ls.lengthOfLongestSubstring(s);
		System.out.println(i);
	}
	
	public int lengthOfLongestSubstring(String s){
		char[] c = s.toCharArray();
		int[] length = new int[c.length];
		ArrayList<Character> al = new ArrayList<Character>();
		for (int j = 0; j < c.length; j++) {
			for(int i=j; i<s.length(); i++){
				if(al.contains(c[i])){
					length[j] = al.size();
					al.clear();
				}else{
					al.add(c[i]);
				}
			}
		}
		int min = length[0];
		for(int i=1; i<c.length;i++){
			if(min < length[i]){
				int temp = min;
				min = length[i];
				length[i] = temp;
			}
		}
		return min;
	}
}
