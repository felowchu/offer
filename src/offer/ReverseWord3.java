package offer;

public class ReverseWord3 {
	public static void main(String[] args){
		System.out.println(ReverseSentence("I am a student."));
	}
	
	public static String ReverseSentence(String str){
		if(str.length() == 0)
			return "";
		char[] c = str.toCharArray();
		String res = "";
		String temp = "";
		for(int i = 0; i < c.length; i++){
			if(c[i] == ' '){
				res = ' ' + temp + res;
				temp = "";
			}
			else 
				temp += c[i];
		}
		if(res.length() > 0)
			res = temp + res; 
		return res;
	}
}
