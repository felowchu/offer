package offer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class PrintTreeFromTopToButtom {
	public ArrayList<Integer> PrintFromTopToButtom(TreeNode root){
		if(root == null)
			return null;
		ArrayList<Integer> al = new ArrayList<Integer>();
		Queue<TreeNode> queue = new ArrayDeque<TreeNode>();
		queue.add(root);
		while(!queue.isEmpty()){
			TreeNode temp = queue.peek();
			if(temp.left != null)
				queue.add(temp.left);
			if(temp.right != null)
				queue.add(temp.right);
			al.add(temp.val);
            queue.poll();
		}
		return al;
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
