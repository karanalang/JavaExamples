package hackerrank.example;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TimeConversion {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		String time = in.next();
		
		System.out.println(time);

		
//		String time ="01:05 PM";
//		SimpleDateFormat sdf = new SimpleDateFormat();
//		Date dt = sdf.parse(time);
//		System.out.println(dt.getTime());

//		Calendar cal = Calendar.getInstance();
//		cal.setTimeInMillis(time);
//		
//		System.out.println(" TIME " + Calendar.HOUR + ":" + Calendar.HOUR);
//		
//		String time1 = Calendar.HOUR + ":" + Calendar.HOUR;
//		
//		if(Calendar.AM_PM == 0)
//			time1 = time1 + "AM";
//		else	
//			time1 = time1 + "PM";
//		
//		System.out.println(time1);
		
//		for(String s : time.split(":")){
//			System.out.println(s);
//		}
		
		if(time.contains("PM")){
			System.out.println(" is PM");
			//get first token, increase by 12
			//split 2nd token, take first part
			
			String s[] = time.split(":");
			
			
			System.out.println(Integer.parseInt(s[0]) + 12);
			System.out.println(s[1]);

			System.out.println(Integer.parseInt(s[0]) + 12 + ":" + s[1].substring(0, 1));
			
			}
		else{
			System.out.println(" is AM ");
			String s[] = time.split(":");
			
			System.out.println(s[0] + ":" + s[1].substring(0, 1));
			
		}
		
			
			
			
		}
}
