package javaExamples;

public class SortingJava {

	public static void main(String[] args){
		
		int[] a = {1, 6, 3, 9, 7};
		
		selectionSort(a);
		
	}
	
	
	public static void insertionSort(int[] vals){
		
		int currInd;
		
		
		for(int pos=1;pos<vals.length; pos++){
			currInd = pos;
			
			while(currInd > 0 && vals[currInd] < vals[currInd - 1]){
				swap(vals, currInd, currInd -1);
				
				currInd = currInd - 1;
			}
		}
		
	}
	

	public static void selectionSort(int[] vals){
		
		System.out.println(" - In selectionSort - ");
		
		int indexMin = 0;
		int i = 0;
		
		for(i =0; i < vals.length; i++){
			
			System.out.println(" - in loop - ");
			
			indexMin = i;
			for(int j = i + 1; j < vals.length; j++){
				
				System.out.println(" - i - "+ i + " - j- "+ j);

				System.out.println(" - vals[j] - " + vals[j]);
				System.out.println(" - vals[indexMin] - " + vals[indexMin]);
				
				if(vals[j] < vals[indexMin]){
				
					indexMin = j;
					swap(vals, indexMin, i);
				}
			}
		}
		
		System.out.println(" - calling swap - ");
		
		
		
	}

	public static void swap(int[] vals, int indexMin, int i){
		
		System.out.println(" - vals -> " + vals + " - indexMin -> " + indexMin + " -- i is -- " + i);
		
		int temp = vals[indexMin];
		
		System.out.println(" - temp is - " + temp);
		
		vals[indexMin] = vals[i];
		vals[i] = temp;
		
		/*
		 * double temp = arr[j];
		 * arr[j] = arr[j-1]
		 * arr[j-1] = temp
		 * j--;
		 * 
		 * */
		
		
		
	}
	
	
}
