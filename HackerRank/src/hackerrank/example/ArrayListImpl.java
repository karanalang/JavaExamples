package hackerrank.example;

import java.util.Arrays;

public class ArrayListImpl {

	private Object[] myStore;
	private int actSize=0;
	
	
	public ArrayListImpl(){
		myStore = new Object[10]; //initial size of arraylist = 10
	}
	
	public void add(Object obj){
		if(myStore.length-actSize <= 5){
			increaseListSize();
		}
		myStore[actSize++] = obj;
	}
	
	public Object remove(int index){
	 if(index < actSize){
		 Object obj = myStore[index];
		 myStore[index] = null;
		 int tmp = index;
		 while(tmp < actSize){
			 myStore[tmp] = myStore[tmp+1];
			 myStore[tmp+1] = null;
			 tmp++;
		 }
		 
		 return obj; 
	 }
	 else{
		 throw new ArrayIndexOutOfBoundsException();
	 }
	}
	
	public Object get(int index){
		
		if(index > actSize)
			throw new ArrayIndexOutOfBoundsException();
		
		return myStore[index];
	}
	
	public int size(){
		return actSize;
	}
	
	
	private void increaseListSize(){
	
		myStore = Arrays.copyOf(myStore, myStore.length*2);
		System.out.println(" new length of store " + myStore.length);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ArrayListImpl al = new ArrayListImpl();
			al.add(new Integer(1));
			al.add(new Integer(2));
			al.add(new Integer(3));
			al.add(new Integer(4));
			al.add(new Integer(5));
			al.add(new Integer(1));
			al.add("karan");
			
			printArrayListItems(al);
			
			al.remove(3);
			printArrayListItems(al);
	
			al.remove(0);
			printArrayListItems(al);
	}
	
	
	
	public static void printArrayListItems(ArrayListImpl al){
		System.out.println(" PRINTING ARRAYLIST ");
		
		for(int i=0; i< al.actSize;i++){
			System.out.println(" arraylist item " + al.get(i));
		}
	}

}
