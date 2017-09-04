package hackerrank.example;

import java.util.Stack;

import hackerrank.example.BinaryTree_PreOrder.TreeNode;

public class BinaryTree_PostOrder {

	
	public static class TreeNode{
		int data;
		TreeNode left;
		TreeNode right;
		TreeNode(int data){
			this.data = data;
		}
	}
	
	public static void postOrderRecursive(TreeNode root){
	
		if(root != null){
//			if(root.left != null){
//				System.out.println(" root.left.data  is => " + root.left.data);
//				System.out.printf("%d ", root.left.data);
//				System.out.println(" ");
//			}
			postOrderRecursive(root.left);
			
//			if(root.right != null){
//				System.out.println(" root.right.data  is => " + root.right.data);
//				System.out.printf("%d ", root.right.data);
//				System.out.println(" ");
//			}	
			postOrderRecursive(root.right);
			System.out.printf("%d ", root.data);
				
		}
		//return root;
	}
	

	public static void postOrderInteractive(TreeNode root){
	
		if(root == null)
			return;
		
		Stack s = new Stack();
		TreeNode current = root;
		
		while(true){
			
			if(current != null){
				if(current.right != null)
					s.push(current.right);
				s.push(current);
				current = current.left;
				continue;
			}
			
			if(s.isEmpty())
				return;
			current = (TreeNode)s.pop();
			
			if(current.right != null && !s.isEmpty() && current.right == s.peek()){
				s.pop();
				s.push(current);
				
				current = current.right;
			}
			else{
				System.out.println(current.data + " ");
				current = null;
			}
		}
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		BinaryTree_PostOrder btree = new BinaryTree_PostOrder();
		//create BinaryTree
		
		TreeNode tnode = createBinaryTree();
		
//		System.out.println(" PostOrder Recursive .. ");
//		postOrderRecursive(tnode);
		
		System.out.println(" ");
		System.out.println(" PostOrder Interactive .. ");
		postOrderInteractive(tnode);
		
		
		
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
	
}
