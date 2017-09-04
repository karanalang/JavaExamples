package hackerrank.example;

/* 
 * Java loads a class only when it is first used/accessed
 * guarantees that before access to the class is allowed, all static members & methods are initiated.
 * since instance is final, only One instance if the class is initiated 
 * Hence, this class is a Singleton class, WITH SAFE LAZY Loading
 * Inner SingletonHolder class is not loaded till getInstance() method is called
 * 
 * Reference : http://stackoverflow.com/questions/7048198/thread-safe-singletons-in-java
 **/



public class SingletonImpl_1 {

	
	private SingletonImpl_1(){
		//initialization code here
	}
	
	
	private static class SingletonHolder{
		public static final SingletonImpl_1 instance = new SingletonImpl_1();
	}
	
	
	public static SingletonImpl_1 getInstance(){
		return SingletonHolder.instance;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
