package offer;

public class DeleteNodeInList {
	public static void deleteNode(Node head, Node delet){
		if(head == null || delet == null)
			return;
		
		if(delet.next != null){
			Node dNext = delet.next;
			delet.value = dNext.value;
			delet.next = dNext.next;
			dNext.next = null;
		}else if(head.equals(delet)){
			head = null;
			delet = null;
		}else{
			Node x = new Node();
			x = head;
			while(x.next != delet){
				x = x.next;
			}
			x.next = null;
			delet = null;
		}
	}
	private static class Node{
		int value;
		Node next;
	}
}
