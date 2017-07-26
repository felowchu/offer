package offer;

public class TreeDepth {
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
