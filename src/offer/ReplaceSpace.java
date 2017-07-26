package offer;

public class ReplaceSpace {
	public static void main(String[] args){
		String string = "We Are Happy";
		System.out.println(replaceSpace(string));
	}
	
	public static String replaceSpace(String s){
		int len = s.length();
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < len; i++){
			if(s.charAt(i)==' '){
				sb.append("%20");
			}else{
				sb.append(s.charAt(i));
			}
		}
		
		return sb.toString();
	}
}
