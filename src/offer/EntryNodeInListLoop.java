package offer;

import java.awt.List;

public class EntryNodeInListLoop {
	public class ListNode{
		int val = 0;
		ListNode next = null;
		public ListNode(int val) {
			this.val = val;
		}
	}
	
	public ListNode EntryNodeOfLoop(ListNode pHead){
		if(pHead == null)
			return null;
		ListNode fast = pHead;
		ListNode slow = pHead;
		while(fast != slow){
			fast = fast.next.next;
			slow = slow.next;
		}
		int LoopLen = 1;
		while(fast.next != fast){
			fast = fast.next;
			LoopLen++;
		}
		ListNode temp1 = pHead;
		ListNode temp2 = pHead;
		for(int i = 0; i < LoopLen; i++){
			temp1 = temp1.next;
		}
		while(temp1 != temp2){
			temp1 = temp1.next;
			temp2 = temp2.next;
		}
		return temp1;
	}
}
