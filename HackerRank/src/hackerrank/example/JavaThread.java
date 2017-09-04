package hackerrank.example;

class RunThread  implements Runnable {

	public static int myCount =0;
	
	RunThread(){
		System.out.println(" In RunThread ");
	}
	
	
	public void run(){
		while(RunThread.myCount <= 10){
			try{
				System.out.println(" Expl Thread : " + (++RunThread.myCount));
				Thread.sleep(100);
			}
			catch(InterruptedException e){
				System.out.println(" - e - " + e.getMessage());
			}
		}
	}

}

public class JavaThread{
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(" starting main thread");
		RunThread rt = new RunThread();
		
		System.out.println(" RunThread rt -> " + rt);
		
		Thread t = new Thread(rt);
		
		System.out.println(" Thread t -> " + t);
		
		
		t.start();
		
		System.out.println(" After callin t.start() ");
		
		while(RunThread.myCount <= 10){
		try{
			System.out.println("Main Thread : " + (++RunThread.myCount));
			
			System.out.println(" Main Thread - Sleepin now for 100 ms");
			Thread.sleep(100);
		}
		catch(InterruptedException e){
			System.out.println(" - e - " + e.getMessage());
		}
	}
}
}