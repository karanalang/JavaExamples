package hackerrank.example;

import java.util.Scanner;

public class DiagonalDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int diagOne = 0;
		int diagTwo = 0;
		
		int a[][] = new int[n][n];
		
		for(int a_i=0; a_i< n; a_i ++){
			for(int a_j=0;a_j < n; a_j++){
					a[a_i][a_j] = in.nextInt();
			
					if(a_i == a_j)
						diagOne += a[a_i][a_j];
					
					if(a_i + a_j == (n-1))
						diagTwo += a[a_i][a_j];
				
					
			
			}
		}
		System.out.println(Math.abs(diagOne - diagTwo));
		
		
	
	}

}
