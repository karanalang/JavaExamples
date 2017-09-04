package hackerrank.example;

public class SingleLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		
		
	
	}

}


class LinkedList{
	
	int size;
	Node start;
	Node end;
	
	LinkedList(){
		size =0;
		start = null;
		end = null;
	}
	
	public boolean isEmpty(){
		return start == null;
	}
	
	public void insertAtStart(int val){
		
		Node strNode = new Node(val, null);
		//strNode.setData(val);
		size++;
		
		if(this.start == null){
			this.start = strNode; 
			this.end = start;
			
		}
		else{
			strNode.setNode(start);
			start = strNode;
		}	
		
	}
	
	public void insertAtPos(int val, int pos){
		Node nd = new Node(val, null);
			
		
	}
	
	
}



class Node{
	protected int data;
	protected Node link;
	
	public Node(){
		link = null;
		data = 0;
	}
	
	public Node(int d, Node n){
		link = n;
		data = d;
	}
	
	public void setNode(Node n){
		link = n;
	}
	
	public void setData(int d){
		data = d;
	}
	

	public Node getNode(){
		return link;
	}
	
	public int getData(){
		return data;
	}
}
