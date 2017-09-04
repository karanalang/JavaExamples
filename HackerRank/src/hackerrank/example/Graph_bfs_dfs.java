package hackerrank.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//https://www.codeproject.com/articles/32212/introduction-to-graph-with-breadth-first-search-bf

public class Graph_bfs_dfs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GNode nA = new GNode('A');
		GNode nB = new GNode('B');
		GNode nC = new GNode('C');
		GNode nD = new GNode('D');
		GNode nE = new GNode('E');
		GNode nF = new GNode('F');
		
		Graph g=new Graph();
		g.addNode(nA);
		g.addNode(nB);
		g.addNode(nC);
		g.addNode(nD);
		g.addNode(nE);
		g.addNode(nF);
		
		g.setRootNode(nA);
		
		g.connectNode(nA, nB);
		g.connectNode(nA, nC);
		g.connectNode(nA, nD);
		
		g.connectNode(nB, nE);
		g.connectNode(nB, nF);
		g.connectNode(nC, nF);
		
	
//		System.out.println(" DFS Traversal of a tree is ----");
//		g.dfs();
	
		System.out.println(" BFS Traversal of a tree is ----");
		g.bfs();

	}

}

class GNode{
	
	public char label;
	public boolean visited = false;
	
	GNode(char l){
		this.label = l;
	}
	
	
}


class Graph{
	public GNode rootNode; //root node
	public ArrayList nodes = new ArrayList(); //list of nodes
	public int[][] adjMatrix; //edges will be represented as Adjacency Matrix
	int size; //Number of Nodes in the Tree 
	
	
	public void setRootNode(GNode nd){
		this.rootNode = nd;
	}
	
	public GNode getRootNode(){
		return rootNode;
	}
	
	public void addNode(GNode nd){
		nodes.add(nd);
	}
	
	public void connectNode(GNode startNode, GNode endNode){
		if(adjMatrix == null){
			size = nodes.size();
			adjMatrix = new int[size][size];
		}
		
		int startIndex = nodes.indexOf(startNode);
		int endIndex = nodes.indexOf(endNode);
		
		adjMatrix[startIndex][endIndex] = 1;
		adjMatrix[endIndex][startIndex] = 1;
	}
	
	public GNode getUnvisitedChildNode(GNode n){
		
		int index = nodes.indexOf(n);
		int j=0;
		
		while(j<size){
			if(adjMatrix[index][j] == 1 && ((GNode)nodes.get(j)).visited ==false ){
				return (GNode)nodes.get(j);
			}
			j++;
		}
	
		return null;
		
	}
	
	public void bfs(){
		//uses a Queue,
		Queue q = new LinkedList();
		q.add(this.rootNode);
		printNode(rootNode);
		
		rootNode.visited = true;
		while(!q.isEmpty()){
			//REMOVES THE HEAD NODE
			GNode n = (GNode) q.remove();
			
			System.out.println(" Removing this node from q " + n.label);
			
			//printQueueNodes(q);
			
			GNode child = null;
			
			while((child=getUnvisitedChildNode(n)) != null){
				child.visited = true;
				printNode(child);
				
				q.add(child);
			}
			printQueueNodes(q);
		}
		
		//clear status = visited for all nodes
		clearNodes();
	}
	
	
	public void dfs(){
		//first-in-last-out - uses a stack
		Stack s = new Stack();
		s.push(this.rootNode);
		rootNode.visited = true;
		
		while(!s.isEmpty()){
			GNode n  = (GNode)s.peek();
			GNode child = getUnvisitedChildNode(n);
			
			if(child != null){
				child.visited = true;
				printNode(child);
				s.push(child);	
			}
			else{
				s.pop();
			}	
		}
		clearNodes();
	}

	//Utility method for clearing the visited property of Nodes
	private void clearNodes(){
		int i=0;
		while(i<size){
			GNode n = (GNode)nodes.get(i);
			n.visited = false;
			i++;
		}
	}

	
	private void printNode(GNode n){
		System.out.println(" Node label is, " + n.label);
	}

	private void printQueueNodes(Queue q){
		for(Object s : q){
			System.out.println(" element in queue " + ((GNode)s).label);
		}
		//System.out.println(q);
	}

}
