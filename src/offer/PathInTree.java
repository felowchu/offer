package offer;

import java.util.ArrayList;

public class PathInTree {
	private ArrayList<ArrayList<Integer>> allPath = new ArrayList<ArrayList<Integer>>();
	public ArrayList<ArrayList<Integer>> findAllPAth(TreeNode root, int target){
		ArrayList<Integer> path = new ArrayList<Integer>();
		if(root == null)
			return allPath;
		findPath(root, target, path,0);
		return allPath;
	}
	public void findPath(TreeNode root, int target, ArrayList<Integer> path, int sum){
		sum += root.val;
		boolean isLeaf = root.left == null && root.right == null;
		path.add(root.val);
		if(sum == target && isLeaf){
			allPath.add(path);
		}
		if(root.left != null){
			findPath(root.left, target, path, sum);
		}
		if(root.right != null){
			findPath(root.right, target, path, sum);
		}
		path.remove(path.size()-1);
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
