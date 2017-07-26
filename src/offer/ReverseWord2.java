package offer;

public class ReverseWord2 {
	public static void main(String[] args){
		System.out.println(ReverseSentence("I am a student."));
	}
	public static String ReverseSentence(String str){
		if(str.length() == 0)
			return "";
		int start = 0;
		int end = str.length() - 1;
		String reverse = Reverse(str, start, end);
		
		start = end = 0;
		while(start < reverse.length()){
			if(reverse.charAt(start) == ' '){
				start++;
				end++;
			}else if((end < reverse.length() && reverse.charAt(end) == ' ') || end == reverse.length()){
				reverse = Reverse(reverse, start, --end);
				start = ++end;
			}else
				end++;
		}
		return reverse;
	}
	public static String Reverse(String str, int start, int end){
		if(str.length() == 0 || start > end || end > str.length()-1)
			return "";
		char[] c = str.toCharArray();
		while(start < end){
			char temp = c[end];
			c[end] = c[start];
			c[start] = temp;
			start++;
			end--;
		}
		String result = new String(c);
		return result;
	}
}
