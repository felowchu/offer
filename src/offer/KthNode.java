package offer;

public class KthNode {
	public class TreeNode{
		int val;
		TreeNode left = null;
		TreeNode right = null;
		TreeNode(int val){
			this.val = val;
		}
	}
	private int index = 0;
	public TreeNode kthNode(TreeNode pRoot, int k){
		if(pRoot == null || k <= 0)
			return null;
		index = k;
		return kthNodeCore(pRoot);
	}
	public TreeNode kthNodeCore(TreeNode pRoot){
		if (pRoot != null) {
			TreeNode node = null;
			node = kthNodeCore(pRoot.left);
			if (node != null)
				return node;
			if (pRoot != null) {
				index--;
			}
			if (index == 0)
				return pRoot;
			node = kthNodeCore(pRoot.right);
			if (node != null)
				return node;
		}
		return null;
	}
}
