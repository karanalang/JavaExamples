package hackerrank.example;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Test2 {

	
	    public static void main(String args[] ) throws Exception {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
	        
	        BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
	            
	        int numLine = Integer.parseInt(buffer.readLine());
	        int sum = 0;
	        
	        for(int i=0;i<numLine; i++){
	        	sum = sum + Integer.parseInt(buffer.readLine());
	        }
	            
	}
	
}
