package hackerrank.example;

import java.util.Scanner;

public class ArrayReverseOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			Scanner in = new Scanner(System.in);
			
			int n = in.nextInt();
			int arr[] = new int[n];
			int revArr[] = new int[n];
			
			for(int i=0; i< n; i++){
				arr[i] = in.nextInt();
			}
			
			revArr = reverseArr(arr);
			for(int i=0; i<n; i++){
				System.out.println(revArr[i]);
			}
	}

	public static int[] reverseArr(int[] arr){
		
		System.out.println(" in revArr ");
		
		int revArr[] = new int[arr.length];
		
		
		System.out.println(" in revArr " + revArr);
		
		for(int i=0; i< arr.length; i++){
			revArr[arr.length-1 - i] = arr[i]; 
			
			
		}
		
		return revArr;
	}
	
}
