package offer;
public class BalancedBinaryTree3 {
	public int Dleft = 0;
	public int Dright = 0;
	public boolean isBalanced(TreeNode root, int Depth){
		if(root == null)
			return true;
		while(isBalanced(root.left,Dleft) && isBalanced(root.right,Dright)){
			int dif = Dleft - Dright;
			if(dif >= -1 && dif <= 1){
				Depth = Dleft > Dright ? (Dleft + 1) : (Dright + 1);
				return true;
			}
		}
		return false;
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
