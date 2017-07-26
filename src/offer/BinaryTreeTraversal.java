package offer;

public class BinaryTreeTraversal {
	public class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int val, TreeNode left, TreeNode right){
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}
	
	public void printNode(TreeNode node){
		System.out.print(node.val+" ");
	}
	
	//先序遍历
	public void preOrderTraversal(TreeNode root){
		printNode(root);
		if(root.left != null)
			preOrderTraversal(root.left);
		if(root.right != null)
			preOrderTraversal(root.right);
	}
	//中序遍历
	public void inOrderTraversal(TreeNode root){
		if(root.left != null)
			inOrderTraversal(root.left);
		printNode(root);
		if(root.right != null)
			inOrderTraversal(root.right);
	}
	//后序遍历
	public void postOrderTraversal(TreeNode root){
		if(root.left != null)
			postOrderTraversal(root.left);
		if(root.right != null)
			postOrderTraversal(root.right);
		printNode(root);
	}
	
	public TreeNode init(){
		TreeNode J = new TreeNode(8, null, null);
		TreeNode H = new TreeNode(4, null, null);
		TreeNode G = new TreeNode(2, null, null);
		TreeNode F = new TreeNode(7, null, J);
		TreeNode E = new TreeNode(5, H, null);
		TreeNode D = new TreeNode(1, null,G);
		TreeNode C = new TreeNode(9, F, null);
		TreeNode B = new TreeNode(3, D, E);
		TreeNode A = new TreeNode(6, B,C);
		return A;
	}
	
	public static void main(String[] args){
		BinaryTreeTraversal binarytree = new BinaryTreeTraversal();
		TreeNode root = binarytree.init();
		//先序遍历
		binarytree.preOrderTraversal(root);
		System.out.println();
		//中序遍历
		binarytree.inOrderTraversal(root);
		System.out.println();
		//后序遍历
		binarytree.postOrderTraversal(root);
	}
}
