package offer;

public class Main5 {
	public static void main(String[] args){
		System.out.println(main("200-trad-code", "*tra��-code"));
	}
	public static int main(String message, String pattern){
		if(message == null || pattern == null)
			return 0;
		int messageIndex = 0;
		int patternIndex = 0;
		int flag = 0;
		char[] Message = message.toCharArray();
		char[] Pattern = pattern.toCharArray();
		boolean isMatch = filterCore(Message, messageIndex, Pattern, patternIndex);
		if(isMatch)
			flag = 1;
		return flag;
			
	}
	public static boolean filterCore(char[] Message, int messageIndex, char[] Pattern, int patternIndex) {
		//���Pattern��Messageͬʱ������ֹ״̬������ɹ�
		if(messageIndex == Message.length && patternIndex == Pattern.length)
			return true;
		
		//���Pattern�Ƚ�����ƥ��ʧ��
		if(messageIndex != Message.length && patternIndex == Pattern.length)
			return false;
		//���ģʽ��"*"������������ת״̬
		if(patternIndex < Pattern.length && Pattern[patternIndex] == '*'){
			return  filterCore(Message, messageIndex+1, Pattern, patternIndex+1)  //ƥ��һ���ַ�
					|| filterCore(Message, messageIndex, Pattern, patternIndex+1) //û��ƥ��
			        || filterCore(Message, messageIndex+1, Pattern, patternIndex);//ƥ��
		}
		if(messageIndex != Message.length && (Message[messageIndex] == Pattern[patternIndex] || Pattern[patternIndex] == '?')){
			return filterCore(Message, messageIndex+1, Pattern, patternIndex+1);
		}
		return false;
	}
}
