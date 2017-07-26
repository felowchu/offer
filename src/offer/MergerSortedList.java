
package offer;

public class MergerSortedList {
	public ListNode merge(ListNode list1, ListNode list2){
		if(list1 == null)
			return list2;
		if(list2 == null)
			return list1;
		ListNode mergHead = null;
		if(list1.val <= list2.val){
			mergHead = list1;
			mergHead.next = merge(list1.next, list2);
		}else{
			mergHead = list2;
			mergHead.next = merge(list1,list2.next);
		}
		return mergHead;
	}
	
	public class ListNode{
		int val;
		ListNode next;
		
		ListNode(int val){
			this.val = val;
		}
	}
}
