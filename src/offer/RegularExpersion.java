package offer;

public class RegularExpersion {
	public static void main(String[] args){
		char[] a = {};
		char[] b = {'.'};
		System.out.println(match(a,b));
	}
	public static boolean match(char[] str, char[] pattern){
		if(str == null || pattern == null)
			return false;
		int strIndex = 0;
		int pattrenIndex = 0;
		return matchCore(str, strIndex, pattern, pattrenIndex);
	}
	public static boolean matchCore(char[] str, int strIndex, char[] pattern, int patternIndex){
		//���ͬʱ����β��˵��ƥ��ɹ�
		if(strIndex == str.length && patternIndex == pattern.length)
			return true;
		//����ַ���ûƥ���꣬ƥ��ʧ��
		if(strIndex != str.length && patternIndex == pattern.length)
			return false;
		if(patternIndex + 1 < pattern.length && pattern[patternIndex + 1] == '*'){
			if(strIndex < str.length && (pattern[patternIndex] == str[strIndex] || pattern[patternIndex] == '.')){
				return matchCore(str, strIndex, pattern, patternIndex + 2)
					|| matchCore(str, strIndex + 1, pattern, patternIndex)
				    || matchCore(str, strIndex + 1, pattern, patternIndex + 2);  
			}else
				return matchCore(str, strIndex, pattern, patternIndex+2);
		}
		if(strIndex < str.length && (pattern[patternIndex] == str[strIndex] || pattern[patternIndex] == '.'))
			return matchCore(str, strIndex+1, pattern, patternIndex+1);
		return false;
	}
}
