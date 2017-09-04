package hackerrank.example;

public class ExtendThreadClass {

	public static void main(String args[]){
		System.out.println(" startingmain thread");
		MyThread mt = new MyThread();
		mt.start();
		while(MyThread.myCount <= 10){
            try{
                System.out.println("Expl Thread: "+(++MyThread.myCount));
                Thread.sleep(100);
            } catch (InterruptedException iex) {
                System.out.println("Exception in thread: "+iex.getMessage());
            }
		}
	}
	
}


class MyThread extends Thread{
	
	public static int myCount = 0;
	public void run(){
		System.out.println(" in run() ");
		while(MyThread.myCount <= 10){
            try{
                System.out.println("Main Thread: "+(++MyThread.myCount));
                Thread.sleep(100);
            } catch (InterruptedException iex) {
                System.out.println("Exception in thread: "+iex.getMessage());
           }		
		}
	}
}

