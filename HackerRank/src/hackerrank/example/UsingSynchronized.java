package hackerrank.example;

public class UsingSynchronized {

	static int count = 0;
	
	public static synchronized void add(int val){
		val += count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
