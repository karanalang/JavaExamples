package hackerrank.example;

import java.util.Scanner;

public class PrintStaircase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		//int arr[][] = new int[n][n];
		
		
		for(int arr_r=0; arr_r <= n-1; arr_r++){
			//print n-1 zeros, 1 - #
			for(int arr_c=0; arr_c <= n-1; arr_c++){

				//arr[arr_r][arr_c] = in.nextInt();
				
				//System.out.println( arr_r + " " +  arr_c + " n-1 " + (n-1));
				
				if((arr_r + arr_c) >= (n-1))
					System.out.print("#");
				else 
					System.out.print(" ");
			}
			//System.out.println("ghello");	
			System.out.println();	
		}
		
		
	}

}
