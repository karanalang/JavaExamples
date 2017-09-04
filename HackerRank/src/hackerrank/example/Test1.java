package hackerrank.example;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
        int _n;
        _n = Integer.parseInt(in.nextLine().trim());
        
        StairCase(_n);
	
	}

	public static int a = 0;
	
	static void StairCase(int n) {
        
       // System.out.println("\n");
       
        while(a < n){
        a = a +1;
        
        System.out.println("\n");
        
            for(int i =0; i< a; i++){
                System.out.print('#');   
            }
          }
                    

        
      
    }
}
