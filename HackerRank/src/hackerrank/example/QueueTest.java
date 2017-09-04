package hackerrank.example;
import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayList;


public class QueueTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q = new LinkedList();
		q.add("A");
		q.add("B");
		
		printQueueObjects(q);
		
		q.remove();
		
		printQueueObjects(q);
		
	}
	
	
	static void printQueueObjects(Queue q){
		
		System.out.println(" PRINTING OBJECT OF QUEUUE .....");
		
		//q.iterator()
		//Iterator a = q.iterator();
		
		for(Object o : q){
			System.out.println(o);
		}
		
	}
	
	

}
