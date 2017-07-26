package offer;

public class KthNodeInBST {
	public int index = 0;
	public class TreeNode{
		int val = 0;
		TreeNode left = null;
		TreeNode right = null;
		TreeNode(int val){
			this.val = val;
		}
	}
	
	public TreeNode KthNode(TreeNode pRoot, int k){
		if(pRoot == null || k <= 0)
			return pRoot;
		index = k;
		return KthNodeCore(pRoot); 
	}
	
	public TreeNode KthNodeCore(TreeNode pNode){
		TreeNode target= null;
		if(pNode.left != null)
			target = KthNodeCore(pNode.left);
		if(target == null){
			if(index == 1)
				target = pNode;
			index--;
		}
		if(target == null && pNode.right != null)
			target = KthNodeCore(pNode.right);
		return target;
	}
}
