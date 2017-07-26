package offer;
/*在输入合法的前提下由前序遍历和中序遍历重建二叉树
 * */

public class ConstrunctBinaryTree2 {
	public TreeNode reConstructBinaryTree(int[] pre, int[] in){
		if(pre.length == 0 || in.length == 0)
			return null;
		return construct(pre, 0, pre.length-1, in, 0, in.length-1);
	}
	
	public static TreeNode construct(int[] pre, int startPre, int endPre, int[] in, int startIn, int endIn){
		if(startPre > endPre || startIn > endIn)
			return null;
		TreeNode root = new TreeNode(pre[startPre]);
		for(int i = startIn; i <= endIn; i++){
			if(in[i] == pre[startPre]){
				root.left = construct(pre, startPre+1, startPre+i-startIn, in, startIn, i-1);
				root.right = construct(pre, i-startIn+startPre+1, endPre, in, i+1, endIn);
			}
		}
		return root;
	}
	public static class TreeNode{
		int value;
		TreeNode left;
		TreeNode right;
		TreeNode(int value){
			this.value = value;
		}
	}
}
