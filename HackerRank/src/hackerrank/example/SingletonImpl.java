package hackerrank.example;

public class SingletonImpl {

	static SingletonImpl mySingleton;
	static int i; 
	
	private SingletonImpl(){
		System.out.println(" singletonImpl " );
			i = 10;
	}
		
	// single point of access for getting 
	//synchronized - makes the object threadsafe, enables a block ensuring on one thread is
	// able to access the object at a time.. all other thread attempting to access the synchronized block
	//are blocked until the thread currently accessing the synchronized block leaves the block
	public static synchronized SingletonImpl getSingleton() {
		
		if(mySingleton == null){
			mySingleton = new SingletonImpl();
		}
		return mySingleton;
	}
	
	//http://stackoverflow.com/questions/7048198/thread-safe-singletons-in-java
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SingletonImpl ms = getSingleton();
		System.out.println(" ms is -> " + ms);
		
		System.out.println(" ms. i -> " + ms.i);
		
		SingletonImpl ms1 = getSingleton();
		System.out.println(" (ms1 == ms) -> " + (ms1 == ms));
		
//		SingletonImpl ms2 = new SingletonImpl();
//		System.out.println(" (ms1 == ms) -> " + (ms1 == ms2));
		
	}

}

class createSingleton{

	public static void main(String[] args){
		SingletonImpl ms4 = SingletonImpl.getSingleton();
	}
	
}
