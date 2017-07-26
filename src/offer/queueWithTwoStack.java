package offer;

import java.util.Stack;

/*用两个栈模拟一个队列
 * */
public class queueWithTwoStack<T> {
	private Stack<T> stack1 = new Stack<T>();
	private Stack<T> stack2 = new Stack<T>();
	
	public void enqueue(T node){
		stack1.push(node);
	}
	
	public T dequeue(){
		while(stack2.size() <= 0){
			while(stack1.size() > 0){
				T data = stack1.pop();
				stack2.push(data);
			}
		}
		
		if(stack2.size() == 0)
			throw new NullPointerException("the queue is empty");
		return stack2.pop();
	}
}
