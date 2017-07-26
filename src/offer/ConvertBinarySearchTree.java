package offer;

public class ConvertBinarySearchTree {
	public TreeNode convert(TreeNode root){
		TreeNode lastNodeInList = null;
		convertNode(root, lastNodeInList);
		TreeNode headOfList = lastNodeInList;
		while(headOfList != null && headOfList.left != null){
			headOfList = headOfList.left;
		}
		return headOfList;
	}
	
	public void convertNode(TreeNode root, TreeNode lastNodeList){
		if(root == null)
			return;
		TreeNode current = root;
		if(current.left != null){
			convertNode(current.left,lastNodeList);
		}
		current.left = lastNodeList;
		if(lastNodeList != null){
			lastNodeList.right = current;
		}
		lastNodeList = current;
		if(current.right != null){
			convertNode(current.right, lastNodeList);
		}
	}
	
	public class TreeNode{
		int val = 0;
		TreeNode left ;
		TreeNode right ;
		TreeNode(int val, TreeNode left, TreeNode right){
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}
	
	public TreeNode init(){
		TreeNode D = new TreeNode(4, null, null);
		TreeNode E = new TreeNode(8, null, null);
		TreeNode F = new TreeNode(12, null, null);
		TreeNode J = new TreeNode(16, null, null);
		TreeNode B = new TreeNode(6, D, E);
		TreeNode C = new TreeNode(14, F, J);
		TreeNode A = new TreeNode(10, B, C);
		return A;
	}
	
	public static void main(String[] args){
		ConvertBinarySearchTree cbst = new ConvertBinarySearchTree();
		TreeNode root = cbst.init();
		TreeNode listHead = cbst.convert(root);
		TreeNode current = listHead;
		while(current.right != null){
			System.out.print(current.val+" ");
			current = current.right;
		}
	}
}
