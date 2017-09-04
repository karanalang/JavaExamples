package hackerrank.example;

import java.util.Scanner;

public class TimeConversion1 {

	 public static void main(String[] args) {
	       Scanner in = new Scanner(System.in);
	       // String time = in.next();
	       
	        String time="11:45:54AM";
	        
	        if(time.contains("PM")){
				//System.out.println(" is PM");
				//get first token, increase by 12
				//split 2nd token, take first part
				
				String s[] = time.split(":");
				
				//System.out.println(Integer.parseInt(s[0]) + 12);
				//System.out.println(s[1]);

	            if(Integer.parseInt(s[0]) < 12){
				System.out.println(Integer.parseInt(s[0]) + 12 + ":" + s[1] + ":" +  s[2].substring(0, 2));
	            }
	            else
	            	System.out.println(Integer.parseInt(s[0]) + ":" + s[1] + ":" +  s[2].substring(0, 2));	            
				}
			else{
				//System.out.println(" is AM ");
				String s[] = time.split(":");
				
	            if(Integer.parseInt(s[0]) < 12){
				 System.out.println(s[0] + ":" + s[1] + ":" + s[2].substring(0, 2));
	            }
	            else
	                System.out.println(Integer.parseInt(s[0]) - 12 + "0" + ":" + s[1] + ":" + s[2].substring(0, 2));
	        }
	    }
}
