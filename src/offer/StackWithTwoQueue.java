package offer;

import java.util.ArrayDeque;
import java.util.NoSuchElementException;
import java.util.Queue;

public  class StackWithTwoQueue<E> {
	private Queue<E> queue1 = new ArrayDeque<E>();
	private Queue<E> queue2 = new ArrayDeque<E>();
	
	public void push(E element){
		if(queue1.isEmpty() && queue2.isEmpty())
			queue1.add(element);
		if(queue1.isEmpty()){
			queue2.add(element);
		}
		if(queue2.isEmpty()){
			queue1.add(element);
		}
	}
	
	public E pop(){
		if(queue1.isEmpty() && queue2.isEmpty())
				throw new NoSuchElementException();
			
		if(queue1.isEmpty()){
			while(queue2.size() > 1){
				queue1.add(queue2.poll());
			}
			return queue2.poll();
		}
		if(queue2.isEmpty()){
			while(queue1.size() > 1){
				queue2.add(queue1.poll());
			}
			return queue1.poll();
		}
		return null;
	}
}
