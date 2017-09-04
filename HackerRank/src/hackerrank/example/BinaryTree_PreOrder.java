package hackerrank.example;

import java.util.Stack;

public class BinaryTree_PreOrder {

	public static class TreeNode{
		int data;
		TreeNode left;
		TreeNode right;
		
		TreeNode(int data){
			this.data = data;
		}
	}
	
	//Recursive
	public void preOrderRecursive(TreeNode root){
			
		if(root == null)
			System.out.println(" root data is null ");
		
		if(root != null){
			//visiting the node,printing the data
			System.out.printf("%d ", root.data);
			System.out.println("");
			System.out.println(" calling root.left, root is  " + root.data);
			preOrderRecursive(root.left);
			
			System.out.println(" calling root.right, root is  " + root.data);
			preOrderRecursive(root.right);
		}
	}
	
	
	//Iterative
	public void preOrderIterative(TreeNode root){
		
		if (root == null)
			return;
		
		Stack stack = new Stack();
		stack.push(root);
		
		while(!stack.isEmpty()){
			TreeNode n = (TreeNode)stack.pop();
			System.out.printf("%d ", n.data);
			
			if(n.right != null)
			{	
				System.out.println(" pusing n.right into stack " + n.right.data);
				stack.push(n.right);
			}
				
			if(n.left != null){
				System.out.println(" pusing n.left into stack " + n.left.data);
				stack.push(n.left);
			}	
			
		}
		
	}
	
	
	public static TreeNode createBinaryTree(){
		TreeNode rootNode = new TreeNode(40);
		TreeNode node20 = new TreeNode(20);
		TreeNode node10 = new TreeNode(10);
		TreeNode node30 = new TreeNode(30);
		TreeNode node60 = new TreeNode(60);
		TreeNode node50 = new TreeNode(50);
		TreeNode node70 = new TreeNode(70);

		rootNode.left = node20;
		rootNode.right = node60;
		
		node20.left = node10;
		node20.right = node30;
		
		node60.left = node50;
		node60.right = node70;
		
		node60.left = node50;
		node60.right = node70;
		
		return rootNode;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryTree_PreOrder btree = new BinaryTree_PreOrder();
		TreeNode rootNode = createBinaryTree();
		
//		System.out.println(" Traversing BTree - Recursive PreOrder");
//		btree.preOrderRecursive(rootNode);
		
		
		System.out.println(" Traversing BTree - Iterative PreOrder");
		btree.preOrderIterative(rootNode);
	
	}

}
