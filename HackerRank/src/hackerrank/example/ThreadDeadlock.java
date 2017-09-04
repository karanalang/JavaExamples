package hackerrank.example;

public class ThreadDeadlock {

	public static Object lock1 = new Object();
	public static Object lock2 = new Object();

	
	private static class Thread1 extends Thread{
		public void run(){
			synchronized(lock1){
				System.out.println(" Thread 1: Holding Lock 1..");

				try{Thread.sleep(10);}
				catch(InterruptedException ie){}
		
			System.out.println(" Thread 1: waiting for lock 2..");	
			
			synchronized(lock2) {
				System.out.println("Thread 1 : holding locks 1 & 2");
				}
			}	
		}
		
	}
	
	
	private static class Thread2 extends Thread{
		public void run(){
			synchronized(lock2){
			System.out.println(" Thread 2 : Holding Lock2 ..");	
				
			try{Thread.sleep(10);}
			catch(InterruptedException e){}
		
			System.out.println(" Thread 2 : Waiting for lock 1..");
			
			synchronized(lock1){
			System.out.println(" Thread 2 : holding locks 1 & 2 ..");
				}
			}	
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		
		//calls run() method
		t1.start();
		t2.start();
		
	}

}
