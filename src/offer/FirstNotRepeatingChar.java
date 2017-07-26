package offer;
/*找出字符串中出现的第一个不重复的字符出现的位置*/
public class FirstNotRepeatingChar {
	public int notRepetition(String str){
		if(str == null || str.length() == 0)
			return -1;
		int size = 256;
		int site = -1;
		int[] times = new int[size];
		for(int i = 0; i < str.length(); i++){
			times[str.charAt(i)]++;
		}
		for(int i = 0; i < str.length(); i++){
			if(times[str.charAt(i)] == 1){
				site = i;
				break;
			}
		}
		return site;
	}
}
