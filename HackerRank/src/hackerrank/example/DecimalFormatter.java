package hackerrank.example;

import java.util.Scanner;
import java.math.BigDecimal;
import java.text.DecimalFormat;

public class DecimalFormatter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double noOfPos = 0;
        double noOfNeg = 0;
        double noOfZeros = 0;
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
            
            if(arr[arr_i] > 0)
                noOfPos += 1;
            else if(arr[arr_i] < 0)
                   noOfNeg += 1;
            else
                noOfZeros += 1;
            
                
        }
        
        //System.out.println(n + " " + noOfPos );
        
        //double fractionPos = noOfPos/n
        BigDecimal pos = new BigDecimal(noOfPos/n);
        BigDecimal neg = new BigDecimal(noOfNeg/n);
        BigDecimal zeros = new BigDecimal(noOfZeros/n);
        
        DecimalFormat numberFormat = new DecimalFormat("#.000000"); 
        
        System.out.println(numberFormat.format(noOfPos/n));
        System.out.println(numberFormat.format(noOfNeg/n));
        System.out.println(numberFormat.format(noOfZeros/n));
        //System.out.println(pos + " " + neg + " " + zeros);
        
    }

}

