package hackerrank.example;

import java.util.Scanner;

//import java.security.Signer;


public class ReverseArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[] = new int[n];
		for(int i=n-1;i>=0; i--){
			arr[i] = in.nextInt();
		}

	}

}
