package hackerrank.example;

import java.util.Stack;

import hackerrank.example.BinaryTree_PreOrder.TreeNode;

public class BinaryTree_InOrder {


	public static class TreeNode{
		int data;
		TreeNode left;
		TreeNode right;
		TreeNode(int data){
			this.data = data;
		}
	}
	
	
	//Recursive solution
	public static void inOrderRecursive(TreeNode root){
				
		if(root != null){
			//traverse left tree
			if(root.left != null)
				//System.out.println(" - root.data - " + root.data);
				System.out.println(" - root.left.data - " + root.left.data);
			inOrderRecursive(root.left);
			//print the node
			System.out.printf("%d", root.data);
			System.out.println(" ");
			//traverse the right node
			if(root.right != null)
				System.out.println(" - root.right.data - " + root.right.data);
			inOrderRecursive(root.right);
		}
		else
			System.out.println(" root is null ");	
	
	}
	
	//Iterative 
	public static void inOrderInteractive(TreeNode root){
		
		if(root == null)
			return;
		
		Stack s = new Stack();
		TreeNode currentNode=root;
		
		while(!s.isEmpty() || currentNode!=null){
			
			if(currentNode != null){
				
				System.out.println(" pushing into Stack, currentNode =>  " + currentNode.data + 
						" setting currentNode to currentNode.left " + currentNode.left);
				s.push(currentNode);
				currentNode=currentNode.left;
			}
			else{
				
				
				
				TreeNode n = (TreeNode)s.pop();
				System.out.println(" poping out of Stack, currentNode=>  " + n.data  + " getting node roght to currentNode " );
				
				System.out.printf("%d ", n.data);
				currentNode=n.right;
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
			
		BinaryTree_InOrder btree = new BinaryTree_InOrder();
		//create BinaryTree
		
		TreeNode tnode = createBinaryTree();
		
//		System.out.println(" InOrder Recursive .. ");
//		inOrderRecursive(tnode);
		
		System.out.println(" InOrder Interactive .. ");
		inOrderInteractive(tnode);
		
		
		
	}

}
