package offer;

public class DeleteDupicationListNode {
	public static class ListNode{
		int val = 0;
		ListNode next = null;
		ListNode(int val){
			this.val = val;
		}
	}
	
	public ListNode deleteDuplication(ListNode pHead){
		ListNode preNode = new ListNode(-1);
		preNode.next = pHead;
		ListNode last = preNode;
		ListNode curNode = pHead;

		while(curNode != null && curNode.next != null){
			if(curNode.val == curNode.next.val){
				int value = curNode.val;
				while(curNode != null && curNode.val == value)
					curNode = curNode.next;
				last.next = curNode;
			}else{
				last = curNode;
				curNode = curNode.next;
			}
		}
		return preNode.next;
	}
}
