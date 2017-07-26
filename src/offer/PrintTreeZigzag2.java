package offer;

import java.util.ArrayList;
import java.util.Stack;


public class PrintTreeZigzag2 {
	public class TreeNode{
		int val = 0;
		TreeNode left = null;
		TreeNode right = null;
		TreeNode(int val){
			this.val = val;
		}
 	}
	
	public ArrayList<ArrayList<Integer>> print(TreeNode pRoot){
		ArrayList<ArrayList<Integer>> allLine = new ArrayList<ArrayList<Integer>>();
		if(pRoot == null)
			return allLine;
		ArrayList<Integer> level = new ArrayList<Integer>();
		Stack<TreeNode> currentStack = new Stack<TreeNode>();
		Stack<TreeNode> nextStack = new Stack<TreeNode>();
		currentStack.push(pRoot);
		int flag = 0;
		
		while(!currentStack.isEmpty()){
			TreeNode pNode = currentStack.pop();
			level.add(pNode.val);
			if(flag == 0){
				if(pNode.left != null)
					nextStack.push(pNode.left);
				if(pNode.right != null)
					nextStack.push(pNode.right);
			}else{
				if(pNode.right != null)
					nextStack.push(pNode.right);
				if(pNode.left != null)
					nextStack.push(pNode.left);
			}
			
			if(currentStack.isEmpty()){
				flag = 1-flag;
				Stack<TreeNode> temp = currentStack;
				currentStack = nextStack;
				nextStack = temp;
				allLine.add(new ArrayList<Integer>(level));
				level.clear();
			}
		}
		return allLine;
	}
}
