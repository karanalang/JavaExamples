package hackerrank.example;


class A{
	
	interface Message{
		void msg();
	}
}

public class TestNestedInterface2 implements A.Message{

	public void msg(){
		System.out.println(" implemented A.Message ");
	}
	
	public static void main(String[] args){
		A.Message am = new TestNestedInterface2() ;
			
		am.msg();
		}
}
