package offer;

public class Main5 {
	public static void main(String[] args){
		System.out.println(main("200-trad-code", "*tra？-code"));
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
		//如果Pattern和Message同时到达终止状态，检验成功
		if(messageIndex == Message.length && patternIndex == Pattern.length)
			return true;
		
		//如果Pattern先结束，匹配失败
		if(messageIndex != Message.length && patternIndex == Pattern.length)
			return false;
		//如果模式是"*"，会有三种跳转状态
		if(patternIndex < Pattern.length && Pattern[patternIndex] == '*'){
			return  filterCore(Message, messageIndex+1, Pattern, patternIndex+1)  //匹配一个字符
					|| filterCore(Message, messageIndex, Pattern, patternIndex+1) //没有匹配
			        || filterCore(Message, messageIndex+1, Pattern, patternIndex);//匹配
		}
		if(messageIndex != Message.length && (Message[messageIndex] == Pattern[patternIndex] || Pattern[patternIndex] == '?')){
			return filterCore(Message, messageIndex+1, Pattern, patternIndex+1);
		}
		return false;
	}
}
