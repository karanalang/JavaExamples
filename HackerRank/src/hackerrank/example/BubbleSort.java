package hackerrank.example;

/*
 * A comparison based sorting algorithm 
 * it iterates left to right comparing every couplet(adjacent numbers),moving the smaller element to 
 * the left, it repeats this process until it no longer moves
 * Number of times the inner block is processed 
 * 	n+1 times, where n
 * 
 * */

public class BubbleSort {

	//logic to sort the elements
	public static void bubble_srt(int[] arr){
		int n = arr.length;
		int k;
		for(int m=n;m >=0; m--){			
			System.out.println(" m is " + m);
			
			for(int i=0;i<n-1;i++){
				System.out.println(" i is -" + i);
				
				k=i+1;
				if(arr[i] > arr[k]){
					swapNumbers(i, k, arr);
				}
			}
		}
		
		printArray(arr);
	}
	
	public static void swapNumbers(int i, int k, int[] arr){
		int temp = arr[i];
		arr[i] = arr[k];
		arr[k] = temp;
		
	}
	
	
	public static void printArray(int[] arr){
		for(int i=0;i<arr.length; i++){
				System.out.print(arr[i] + ",");
		}
		System.out.println("\n");
	}
	
	public static void main(String[] args) {
		int[] input = {4,2,9,6, 7, 3};
		//int[] input = {4,2,9,6};
		bubble_srt(input);
	}

}
