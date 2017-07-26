package offer;
/*�ҳ��ַ����г��ֵĵ�һ�����ظ����ַ����ֵ�λ��*/
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
