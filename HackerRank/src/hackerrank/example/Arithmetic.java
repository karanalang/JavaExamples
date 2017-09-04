package hackerrank.example;

import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();
      
        // Write your calculation code here.
        System.out.println(" mealCost "+ mealCost);
        System.out.println(tipPercent);
        System.out.println(taxPercent);
        
        
        
        
        double totalCostDouble = mealCost + (tipPercent*mealCost)/100 + (taxPercent*mealCost)/100;
        
        System.out.println(" totalCostDouble is ->" + totalCostDouble + " tip " + (double)(tipPercent*mealCost)/100 + " tax " + (double)(taxPercent*mealCost)/100 );
        
        // cast the result of the rounding operation to an int and save it as totalCost 
        int totalCost = (int) Math.round(totalCostDouble);
        
        System.out.println(" totalCost is ->" + totalCost);
      
        // Print your result
    }
	
	
}
