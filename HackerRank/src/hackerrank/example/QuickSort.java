package hackerrank.example;

public class QuickSort {

	
	private int[] arr;
	private int len;
	
	
	public void sort(int[] inputArr){
	
		System.out.println(" in sort() fn ");
		
		if(inputArr == null || inputArr.length == 0){
			return;
		}
		
		this.arr = inputArr;
		len = inputArr.length;
		
		System.out.println(" calling quickSort() , len is - " + len);
		
		quickSort(0, len -1);
		
		
	}
	
	public void quickSort(int lowerIndex, int higherIndex){
	
		
		System.out.println(" In quickSort(), lowerIndex " + lowerIndex + " higherIndex " + higherIndex);
		
		int i = lowerIndex;
		int j = higherIndex;
		
		//calculate pivot number
		int pivot = arr[lowerIndex + (higherIndex - lowerIndex)/2];
		
		
		
		System.out.println("" + lowerIndex + " higherIndex " + higherIndex +" pivot is - " + pivot);
		
		//divide into 2 arrays
		while(i <= j){
			/**
             * In each iteration, we will identify a number from left side which 
             * is greater then the pivot value, and also we will identify a number 
             * from right side which is less then the pivot value. Once the search 
             * is done, then we exchange both numbers.
             */
		
			System.out.println(" arr[i] " + arr[i] + " arr[j] " + arr[j]);
			
			while(arr[i] < pivot){
				i++;
			}
			
			while(arr[j] > pivot){
				j--;
			}
			
			if(i <= j){
				exchangeNumbers(i, j);
				//move index to next position on both sides
				i++;
				j--;
			}
			
			if(lowerIndex < j)
				quickSort(lowerIndex, j);
			if(i< higherIndex)
				quickSort(i, higherIndex);
		}
	}
	
	
	public void exchangeNumbers(int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuickSort myquicksort = new QuickSort();
		int[] input = {25, 2, 45, 20, 56, 75, 2, 56, 99, 53, 12};
		
		System.out.println(" In Main .. input length " + input.length);
		
		myquicksort.sort(input);

		for(int i : input){
			System.out.println(i);
			System.out.println(" ");
		}
		
	}

}
