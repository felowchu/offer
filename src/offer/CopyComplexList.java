package offer;

public class CopyComplexList {
	public class RandomListNode{
		int val;
		RandomListNode next = null;
		RandomListNode random = null;
		RandomListNode(int val){
			this.val = val;
		}
	}
	
	public RandomListNode copy(RandomListNode head){
		cloneNodes(head);
		cloneLinks(head);
		RandomListNode copyHead = ReconnectNode(head);
		return copyHead;
	}
	
	public void cloneNodes(RandomListNode head){
		RandomListNode prim = head;
		while(prim != null){
			RandomListNode copy = new RandomListNode(prim.val);
			copy.next = prim.next;
			prim.next = copy;
			prim = copy.next;
		}
	}
	
	public void cloneLinks(RandomListNode head){
		RandomListNode prim = head;
		while(prim != null){
			RandomListNode copy = prim.next;
			if(copy != null){
				copy.random = prim.random.next;
				prim = copy.next;
			}
		}
	}
	
	public RandomListNode ReconnectNode(RandomListNode head){
		RandomListNode prim = head;
		RandomListNode copyhead = null;
		RandomListNode copy = null;
		if (prim != null) {
			copyhead = head.next;
			copy = copyhead;
			prim.next = copy.next;
			prim = prim.next;
		}
		while(prim != null){
			copy.next = prim.next;
			copy = copy.next;
			prim.next = copy.next;
			prim = prim.next;
		}
		return copyhead;
	}
}
