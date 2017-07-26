package offer;
/*反转字符串，单词不反转，该方法不适用前后有空格*/
public class ReverseWord {
	public String ReverseSetence(String str){
		if(str == null)
			return "";
		String[] reverse = str.split(" ");
		String output = "";
		for(int i = reverse.length -1; i >= 0; i--){
			if(i == 0){
				output += reverse[0];
				break;
			}
			output += reverse[i]+" ";
		}
		return output;
	}
}
