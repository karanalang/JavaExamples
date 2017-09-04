package hackerrank.example;

import java.util.Scanner;

public class FlipMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
        //number of queries
		int q = in.nextInt();

		for(int i=0;i< q; i++){
			int n = in.nextInt();
			int[][] board = new int[2*n][2*n];
			
			//creating the board
			for(int j=0; j< 2*n; j++){
				for(int k=0; k< 2*n; k++){
					board[j][k] = in.nextInt();
				}
			}
			
			System.out.println(maxUpperLeftQuadrant(board));
			
//			System.out.println(board);
			
		}	
	}
	
	public static int maxUpperLeftQuadrant(int[][] board){
		
		int sum=0;
		
		for(int row=0; row < board.length/2; row ++){
			for(int col=0; col < board.length/2; col ++){
				
				System.out.println(" maxUpperLeftQuadrant row " + row + " col " + col);
				sum += maxVal(board, row, col);
							
			}
		}
		
		System.out.println(" in maxUpperLeftQuadrant " + sum);
		
		return sum;
	}

	public static int maxVal(int[][] board, int row, int col){
		
		System.out.println(" row -> " + row + " col " + col);
		
		int maxVal = board[row][col];
		
		System.out.println(" maxVal 1 " + maxVal);
		
		int altRow = (board.length -1) - row;
		int altCol = (board.length -1) - col;
		
		System.out.println(" altRow " + altRow + " altCol " + altCol);
		
		maxVal = Math.max(maxVal, board[altRow][col]);
		
		System.out.println(" maxVal 2 - " + maxVal + " altRow " + altRow + " col " + col);
		
		maxVal = Math.max(maxVal, board[row][altCol]);
		
		System.out.println(" maxVal 3 - " + maxVal + " row " + row + " altCol " + altCol);
		
		maxVal = Math.max(maxVal, board[altRow][altCol]);
		
		System.out.println(" maxVal 4 - " + maxVal + " altRow " + altRow + " altCol " + altCol);
		
		return maxVal;
	}
	
}
