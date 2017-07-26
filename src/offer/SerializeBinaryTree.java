package offer;

public class SerializeBinaryTree {
	public int index = -1;
	public class TreeNode{
		int val = 0;
		TreeNode left = null;
		TreeNode right = null;
		TreeNode(int val){
			this.val = val;
		}
	}
	
	public String serialize(TreeNode root){
		StringBuilder sb = new StringBuilder();
		if(root == null){
			sb.append("#,");
			return sb.toString();
		}
		sb.append(root.val+",");
		sb.append(serialize(root.left));
		sb.append(serialize(root.right));
		return sb.toString();
	}
	
	public TreeNode deserialize(String str){
		index++;
		String[] pNode = str.split(",");
		TreeNode head = null;
		if(!pNode[index].equals("#")){
			head = new TreeNode(Integer.valueOf(pNode[index]));
			head.left = deserialize(str);
			head.right = deserialize(str);
		}
		return head;
	}
}
