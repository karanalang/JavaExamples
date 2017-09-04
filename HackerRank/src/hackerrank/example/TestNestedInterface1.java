package hackerrank.example;

interface Showable{
	
	void show();
	
	interface Message{
		void msg();
	}
	
}

public class TestNestedInterface1 implements Showable.Message{

	public void msg(){
		System.out.println("Hello TestNestedInterface1");
	}
	
	public static void main(String[] args){
		Showable.Message message = new TestNestedInterface1();
		message.msg();
	}
	
}
