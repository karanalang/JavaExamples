package hackerrank.example;

abstract class Person{
	abstract void eat();
}


public class TestAnonymousInner {

	public static void main(String[] args){
		Person p = new Person(){
			void eat(){
				System.out.println(" part of class Public ");
			}
		};
	p.eat();
	
	}
	
}
