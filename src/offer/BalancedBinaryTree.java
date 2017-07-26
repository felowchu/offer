package offer;
/*判断一颗二叉树是不是平衡二叉树，使用的是求二叉树深度的算法，重复度较高*/

public class BalancedBinaryTree {
	public boolean isBalance(TreeNode root){
		if(root == null)
			return true;
		int left = treeDepth(root.left);
		int right = treeDepth(root.right);
		int dif = left - right;
		if(dif < -1 || dif > 1)
			return false;
		return isBalance(root.left)&&isBalance(root.right);
	}
	
	public int treeDepth(TreeNode root){
		if(root == null)
			return 0;
		int left = treeDepth(root.left);
		int right = treeDepth(root.right);
		
		return (left > right) ? (left+1) : (right + 1);
	}
	
	public class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int val){
			this.val = val;
		}
	}
}
