package bestchu;

import java.util.ArrayList;
import java.util.Stack;

public class PrintLink {
	public static void main(String[] args){
		
	}
	
	public ArrayList<Integer> printListFromTailToHead(ListNode listNode){
		ArrayList<Integer> al = new ArrayList<Integer>();
		Stack<ListNode> stack = new Stack<ListNode>();
		
		while(listNode != null){
			stack.push(listNode);
			listNode = listNode.next;
		}
		
		while(!stack.isEmpty()){
			ListNode node = stack.peek();
			System.out.println(node.val+",");
			stack.pop();
		}
		
		return al;
	}
	
	class ListNode{
		int val;
		ListNode next = null;
		 ListNode(int val) {
			this.val = val;
		}
		 
	}
}
