package hackerrank.example;

import java.util.ArrayList;
import java.util.List;

public class MyThreadJoin {

	public static List<String> names = new ArrayList<String>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(" In main ");
		
		List<SampleThread> list = new ArrayList<SampleThread>();
		for(int i=0; i<= 1; i++){
			SampleThread st = new SampleThread();
			list.add(st);
			
			System.out.println(" Strating thread " + i);
			
			st.start();
		}
		
		System.out.println(" list.size() " + list.size());
		
		for(SampleThread st1 : list)
			try {
				System.out.println(" calling st1.join " + st1);
				st1.join();
				System.out.println(" after st1.join " + st1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
}



class SampleThread extends Thread{
	
	public void run(){
	
		System.out.println(" in run() ");
		for(int i=0; i<= 1; i++){
			try{
				System.out.println(" sampleThread - going to sleep this " + this + " i -> " + i);
				Thread.sleep(100);
			}
			catch(Exception e){
				e.printStackTrace();
			}
			MyThreadJoin.names.add(getName());
		}
	}
	
}
