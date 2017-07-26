package offer;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class PrintTreeByLines {
	public class TreeNode{
		int val = 0;
		TreeNode left = null;
		TreeNode right = null;
		TreeNode(int val){
			this.val = val;
		}
	}
	
	public ArrayList<ArrayList<Integer>> print(TreeNode pRoot){
		ArrayList<ArrayList<Integer>> allLines = new ArrayList<ArrayList<Integer>>();
		if(pRoot == null)
			return allLines;
		ArrayList<Integer> line = new ArrayList<Integer>();
		int currentLine = 1;
		int nextLine = 0;
		Queue<TreeNode> level = new ArrayDeque<TreeNode>();
		level.add(pRoot);
		
		while(!level.isEmpty()){
			TreeNode pNode = level.poll();
			line.add(pNode.val);
			if (pNode.left != null) {
				level.add(pNode.left);
				nextLine++;
			}
			if(pNode.right != null){
				level.add(pNode.right);
				nextLine++;
			}
			currentLine --;
			if(currentLine == 0){
				currentLine = nextLine;
				nextLine = 0;
				allLines.add(new ArrayList<Integer>(line));
				line.clear();
			}
		}
		return allLines;
	}
}
