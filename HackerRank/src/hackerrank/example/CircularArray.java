package hackerrank.example;

import java.util.Scanner;

public class CircularArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        //number of integers
		int n = in.nextInt();
		// k - number of times operation is performed
		int k = in.nextInt();
		// q -number of queries asked
        int q = in.nextInt();
        int[] a = new int[n];
        int[] a_r = new int[n];
        
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
            System.out.println(" a[a_i] is -> " + a[a_i]);
        }
        
        
        for(int k1 =0; k1 < k; k1 ++)
        {
        	System.out.println(" in k loop -> k = " + k1 + " -- " + a[0] + " - " + a[1] + " - " + a[2]);
        	
        	System.out.println(" n is " + n);
        	
        	for(int a_i=0; a_i < n-1; a_i++){
        		System.out.println(" --- "+ a_i + " <-> " + a[0] + " @@@ " + a[1] + " @@@ " + a[2]);
                a_r[a_i + 1] = a[a_i]; 
                System.out.println(" --- "+ a_i + " <->$$$ " + a[0] + " @@@$$$ " + a[1] + " @@@$$$ " + a[2]);
                //a[a_i] = a_r[]
        	}
        	a_r[0] = a[n-1];

        	a = a_r;
        	System.out.println(a_r[0] + " -$ " + a_r[1] + " -$ " + a_r[2]);
        	System.out.println(a[0] + " - " + a[1] + " - " + a[2]);
        }
        
        
        
        	for(int i=0;i< n ; i ++){
        		//System.out.println(" a[i] " + i + " : " + a[i]);
        		System.out.println(" a_r[i] " + i + " : " + a_r[i]);
        	}
        
//        for(int a0 = 0; a0 < q; a0++){
//            int m = in.nextInt();
//            System.out.println("m is " + m);
//        }
		
		
	}

}
