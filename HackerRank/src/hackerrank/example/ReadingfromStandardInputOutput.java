package hackerrank.example;

import java.util.Scanner;

public class ReadingfromStandardInputOutput {

	
	public static int sumOfInt(int a, int b){
		return a +b;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int a;
		a = in.nextInt();
		int b;
		b = in.nextInt();
		int sum = sumOfInt(a, b);
		
		System.out.println(" sum is " + sum);
		
		
	}

}
