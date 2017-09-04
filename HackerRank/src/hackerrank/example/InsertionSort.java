package hackerrank.example;

/*
 * Builds final sorted array one item at a time
 * Less efficient that quicksort, heapsort, mergesort etc
 * Every repetition on Insertion sort will remove item from input data,inserting into already sorted list
 * until no input remains
 * 
 * 
 * */

public class InsertionSort {

	
	public static void insertionSort(int[] arr){
		int n = arr.length;
		for(int j=0; j < n; j++){
			int key = arr[j];
			int i = j-1;
			
			System.out.println("0. j - " + j + " key (arr[j]) - " + key );
			
			
			
			while( (i > -1) && arr[i] > key){
				System.out.println("in while block -- arr[i] " + arr[i] + " - i is " + i);
				
				arr[i+1] = arr[i];
				i--;
				
				System.out.println(" in while - i - " + i + " -j - " + j);
				
				printArray(arr);
			}
			
			arr[i+1] = key;
			//System.out.println("1. j - " + j + " key (arr[j]) - " + key + " - arr[i+1] - " + arr[i+1]);
			printArray(arr);
		}
	}
	
	
	public static void printArray(int[] arr){
		for(int i=0;i<arr.length; i++){
				System.out.print(arr[i] + ",");
		}
		System.out.println("\n");
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] arr = {4, 2, 9, 6, 23, 12, 34, 0, 1};
		int[] arr = {4, 2, 9, 6};
		insertionSort(arr);
	}

}
