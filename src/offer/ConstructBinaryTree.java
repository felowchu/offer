package offer;

/*由前序遍历和中序遍历求重建二叉树
 * */
public class ConstructBinaryTree {
	public TreeNode reConstructBinaryTree(int[] pre, int[] in){
		if(pre == null || in == null)
			return null;
		return construct(pre,0,pre.length-1,in,0,in.length-1);
	}
	
	public static TreeNode construct(int[] pre, int starp, int endp, int[] in, int stari,int endi){
		int rootValue = pre[starp];
		TreeNode root = new TreeNode();
		root.value = rootValue;
		root.left = null;
		root.right = null;
		
		if (starp == endp) {
			if (stari == endi && pre[starp] == in[stari])
				return root;
			else
				throw new IllegalArgumentException();
		}
		
		int rootIndex = stari;
		for(int i = stari; i <= endi; i++){
			if(in[i] != rootValue){
				++rootIndex;
			}
		}
		if(rootIndex == endi && in[rootIndex] != rootValue)
			throw new IllegalArgumentException();
		
		int LenOfLeft = rootIndex - stari;
		int preLeftEnd = starp + LenOfLeft;
		
		if(LenOfLeft > 0){
			construct(pre, starp+1, preLeftEnd, in, stari, rootIndex-1);
		}
		if(LenOfLeft < endp - starp){
			construct(pre, preLeftEnd+1, endp, in, rootIndex+1, endi);
		}
		return root;
	}
	
	public static class TreeNode{
		int value;
		TreeNode left;
		TreeNode right;
	}
}
