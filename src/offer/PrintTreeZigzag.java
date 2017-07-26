package offer;

import java.util.ArrayList;
import java.util.Stack;

public class PrintTreeZigzag {
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
		Stack<TreeNode>[] num = (Stack<TreeNode>[]) new Stack[2];
		int current = 0;
		int next = 1;
		num[current].push(pRoot);
		ArrayList<Integer> level = new ArrayList<Integer>();
		level.add(pRoot.val);
		allLine.add(new ArrayList<Integer>(level));
		level.clear();
		while(!num[0].isEmpty() || !num[1].isEmpty()){
			TreeNode pNode = num[current].peek();
			num[current].pop();
			level.add(pNode.val);
			if(current == 0){
				if(pNode.left != null)
					num[next].push(pNode.left);
				if(pNode.right != null)
					num[next].push(pNode.right);
			}else{
				if(pNode.right != null)
					num[next].push(pNode.right);
				if(pNode.left != null)
					num[next].push(pNode.left);
			}
			
			if(num[current].isEmpty()){
				current = 1 - current;
				next = 1 - next;
				allLine.add(new ArrayList<Integer>(level));
				level.clear();
			}
		}
		return allLine;
	}
}
