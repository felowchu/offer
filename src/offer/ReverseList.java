package offer;

public class ReverseList {
	public ListNode reverseList(ListNode head){
		if(head == null || head.next == null)
			return head;
		ListNode first = head;
		ListNode second = first.next;
		first.next = null;
		while(second != null){
			ListNode thried = second.next;
			second.next = first;
			first = second;
			second = thried;
		}
		return first;
	}
	public class ListNode{
		int val;
		ListNode next;
		
		ListNode(int val){
			this.val = val;
		}
	}
}
