package offer;

public class NextNodeInBinaryTrees {
	public class TreeLinkNode{
		int val = 0;
		TreeLinkNode left = null;
		TreeLinkNode right = null;
		TreeLinkNode next = null;
		public TreeLinkNode(int val) {
			this.val = val;
		}
	}
	
	public TreeLinkNode getNext(TreeLinkNode pNode){
		if(pNode == null)
			return pNode;
		TreeLinkNode pNext = null;
		if(pNode.right != null){
			pNext = pNode.right;
			while(pNext.left != null)
				pNext = pNext.left;
		}else if(pNode.next != null){
			TreeLinkNode pCurrent = pNode;
			TreeLinkNode pParrent = pNode.next;
			while(pParrent != null && pCurrent == pParrent.right){
	            pCurrent = pParrent;
				pParrent = pParrent.next;
			}
			pNext = pParrent;
		}
		return pNext;
	}
}
