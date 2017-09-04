package hackerrank.example;

import java.util.Scanner;

public class CircularArrayTest {

	
	
	static int[] resetA(int[] a, int[] a_r, int n){
		
		for(int i=0; i< n; i++){
			a[i] = a_r[i];
		}
		return a;
	}
	
	static void printA(int[] a, int k){
		
		for(int i=0; i< k; i++){
			System.out.println(a[i]);
		}
	}
	
	
	
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
        //number of integers
		int n = in.nextInt();
		// k - number of times operation is performed
		int k = in.nextInt();
		int q = in.nextInt();

		int[] a = new int[n];
		int[] a_r = new int[n];
        
        for(int a_n=0; a_n < n; a_n++){
            a[a_n] = in.nextInt();
            //System.out.println(" Initially - a[a_i] is -> " + a[a_n]);
        }
        
        
        for(int k1 =0; k1 < k; k1 ++)
        {
        	//System.out.println(" in k loop -> k = " + k1 + " -- " + a[0] + " - " + a[1] + " - " + a[2]);
        	
        	//System.out.println(" n is " + n);
        	
        	for(int a1=0; a1 < n-1; a1++){
        		//System.out.println(" --- "+ a1 + " <-> " + a[0] + " @@@ " + a[1] + " @@@ " + a[2]);
                a_r[a1 + 1] = a[a1]; 
                //System.out.println(" --- "+ a1 + " <->$$$ " + a[0] + " @@@$$$ " + a[1] + " @@@$$$ " + a[2]);
                //a[a_i] = a_r[]
        	}
        	a_r[0] = a[n-1];

        	resetA(a, a_r, n);
        	//System.out.println(a_r[0] + " -$ " + a_r[1] + " -$ " + a_r[2]);
        	//System.out.println(a[0] + " - " + a[1] + " - " + a[2]);
        	//System.out.println(a_r[k]);
        	
        }
        
        printA(a, q);
	}
}
