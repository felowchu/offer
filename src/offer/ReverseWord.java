package offer;
/*��ת�ַ��������ʲ���ת���÷���������ǰ���пո�*/
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
