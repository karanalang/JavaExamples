package hackerrank.example;

import java.util.ArrayList;
import java.util.List;

public class DynamicArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> dynamicArray = new ArrayList<Integer>();
		
		dynamicArray.add(1);
		dynamicArray.add(2);
		dynamicArray.add(3);
		dynamicArray.add(4);
		dynamicArray.add(5);
		dynamicArray.add(6);
		dynamicArray.add(7);

		for(int i =0; i< dynamicArray.size(); i++){
			System.out.println(" i is  " + dynamicArray.get(i));
		}
		
		
	}

}
