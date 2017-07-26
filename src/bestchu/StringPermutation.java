package bestchu;

public class StringPermutation {
	public  static void main(String[] args){
		String s = "abcde";
		permutation(s);
	}
	
	public static void permutation(String s){
		if(s == null)     return;
		char[] cs  = s.toCharArray();
		permutation(cs, 0);
	}
	
	public static void permutation(char[] s, int index){
		if(index == s.length){
			System.out.println(s);
		}else{
			for(int i = index; i < s.length; i++){
				char temp = s[i];
				s[i] = s[index];
				s[index] = temp;
				
				permutation(s,index+1);
				
				 temp = s[i];
				s[i] = s[index];
				s[index] = temp;
			}
		}
	}
}
