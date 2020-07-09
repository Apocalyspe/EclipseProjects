package io.leetcode;
 
import java.util.Queue;
import java.util.LinkedList;
public class LevelOrderTraversal {
 
	public static class TreeNode {
	    int data;
	    TreeNode left;
	    TreeNode right;
	    TreeNode() {}
	    
	    TreeNode(int data) { this.data = data; }
	    
	    TreeNode(int data, TreeNode left, TreeNode right) {
	    	this.data = data;
	    	this.left = left;
	        this.right = right;
	    }
	    
	    static TreeNode root=null;
	}
 
	public static void main(String[] args)
	{
		// Creating a binary tree
		 TreeNode.root = new TreeNode(40);
		TreeNode node20=new TreeNode(20);
		TreeNode node10=new TreeNode(10);
		TreeNode node30=new TreeNode(30);
		TreeNode node60=new TreeNode(60);
		TreeNode node50=new TreeNode(50);
		TreeNode node70=new TreeNode(70);
 
		TreeNode.root.left=node20;
		TreeNode.root.right=node60;
 
		node20.left=node10;
		node20.right=node30;
 
		node60.left=node50;
		node60.right=node70;
 
		
		System.out.println("Level Order traversal of binary tree will be:");
		levelOrderTraversal(TreeNode.root);
	}
	
	// prints in level order
	public static void levelOrderTraversal(TreeNode startNode) {
		Queue<TreeNode> queue=new LinkedList<TreeNode>();
		queue.add(startNode);
		
		
		while(!queue.isEmpty())
		{
			System.out.printf("%d", startNode.data);
			TreeNode tempNode=queue.poll();
			System.out.printf("%d ",tempNode.data);
			if(tempNode.left!=null)
				queue.add(tempNode.left);
			if(tempNode.right!=null)
				queue.add(tempNode.right);
		}
	}
}