package hackerrank.example;

interface Eatable{
	void eat();
}

public class TestAnonymousInner1{
	public static void main(String[] args){
		
		Eatable e = new Eatable(){
			public void eat(){
				System.out.println(" in eat");
			}
		};
		
		e.eat();
		
	}
	
}
