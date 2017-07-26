package offer;
/*ʹ��ȫ�ֱ�����ÿ���ڵ�ֻ�÷���һ�Σ����Դ��ӿ�����ٶ�*/
public class BalancedBinaryTree2 {
	boolean Balanced = true;
	public boolean isBalance(TreeNode root){
		if(root == null)
			return true;
		int left = treeDepth(root.left);
		int right = treeDepth(root.right);
		int dif = left - right;
		if(dif < -1 || dif > 1)
			return false;
		return Balanced;
	}
	
	public int treeDepth(TreeNode root){
		if(root == null)
			return 0;
		int left = treeDepth(root.left);
		int right = treeDepth(root.right);
		int dif = right - left;
		if(dif < -1 || dif > 1)
			Balanced = false;
		
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
