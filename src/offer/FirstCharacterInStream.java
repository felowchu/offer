package offer;

import java.util.ArrayDeque;
import java.util.Queue;

public class FirstCharacterInStream {
	public char[] hashtable = new char[256];
	Queue<Character> data = new ArrayDeque<Character>();
	
	public FirstCharacterInStream() {
		for(int i = 0; i < hashtable.length; i++)
			hashtable[i] = 0;
	}
	
	public void Insert(char ch){
		hashtable[ch]++;
		if(hashtable[ch] == 1)
			data.add(ch);
	}
	
	public char firstAppearingOnce(){
		while(!data.isEmpty() && hashtable[data.peek()] >= 2)
			data.poll();
		if(data.isEmpty())
			return '#';
		return data.peek();
	}
}
