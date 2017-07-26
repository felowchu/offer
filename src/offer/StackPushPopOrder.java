package offer;
import java.util.Stack;

public class StackPushPopOrder {
	public boolean IsPopOrder(int[] pushA, int[] popA){
		boolean result = false;
		Stack<Integer> stack = new Stack<Integer>();
		int pushNext = 0;
		int popNext = 0;
		while(popNext < popA.length){
			while(stack.isEmpty() || stack.peek() != popA[popNext]){
				if(pushNext == pushA.length)
					break;
				stack.push(pushA[pushNext]);
			}
			if(stack.peek() != popA[popNext])
				break;
			stack.pop();
			popNext++;
		}
		if(popNext == popA.length && stack.isEmpty())
			result = true;
		return result;
	}
}
