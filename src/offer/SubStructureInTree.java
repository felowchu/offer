package offer;

public class SubStructureInTree {
	public boolean HasSubTree(TreeNode root1, TreeNode root2){
		boolean result = false;
		if(root1 != null && root2 != null){
			if (root1.val == root2.val) 
				result = subTreeExist(root1, root2);
			if(!result)
				result = HasSubTree(root1.left, root2);
			if(!result)
				result = HasSubTree(root1.right, root2);
		}
		return result;
	}
	
	public static boolean subTreeExist(TreeNode root1, TreeNode root2){
		if(root2 == null)
			return true;
		if(root1 == null)
			return false;
		if(root1.val != root2.val)
			return false;
		
		return subTreeExist(root1.left, root2.left) &&subTreeExist(root1.right, root2.right);
	}
	public class TreeNode{
		int val = 0;
		TreeNode left = null;
		TreeNode right = null;
		TreeNode(int val){
			this.val = val;
		}
	}
}
