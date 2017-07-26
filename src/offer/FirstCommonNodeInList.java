package offer;

public class FirstCommonNodeInList {
	public ListNode findFirstCommonNode(ListNode head1, ListNode head2){
		int len1 = LenOfList(head1);
		int len2 = LenOfList(head2);
		ListNode longList = head1;
		ListNode shortList = head2;
		int difLen = len1 - len2;
		if(len2 > len1){
			longList = head2;
			shortList = head1;
			difLen = len2 - len1;
		}
		for(int i = 0; i < difLen; i++){
			longList = longList.next;
		}
		while(longList != null && shortList != null && longList != shortList){
			longList = longList.next;
			shortList = shortList.next;
		}
		ListNode firstCommonNode = longList;
		return firstCommonNode;
	}
	public int LenOfList(ListNode head){
		int Len = 0;
		ListNode node = head;
		while(node != null){
			Len++;
			node = node.next;
		}
		return Len;
	}
	public class ListNode{
		int val;
		ListNode next;
		ListNode(int val){
			this.val = val;
		}
	}
}
