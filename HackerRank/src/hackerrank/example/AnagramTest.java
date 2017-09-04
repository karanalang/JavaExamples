package hackerrank.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AnagramTest {

	public static void main(String[] args) throws Exception, IOException {
		// TODO Auto-generated method stub

		String[] args1 = {"3", "aaabbb", "cd", "abc"};
		
		
//		BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
         
	        int numLine = Integer.parseInt(args1[0]);

//			System.out.println(" args1[0] " + numLine);
		
//	        System.out.println(" numLine " + numLine);
	        
	        for(int i=0;i<numLine; i++){
	        		
	        		int numChanges = 0;
	        		
	        		String str1 = args1[i+1];
	        		
//	        		System.out.println(" str1 length is " + (double)str1.length()/2 + " str1.length() " + str1.length());
	        		double lenstr = Math.ceil((double)str1.length()/2);
	        		
	        		String substr1 = str1.substring(0, (int)lenstr);
	        		String substr2 = str1.substring((int)lenstr, str1.length());
	        		
//	        		System.out.println(" str1 is " + str1);
	        		System.out.println(" - lenstr -" + lenstr);
	        		System.out.println(" - substr1 -" + substr1);
	        		System.out.println(" - substr2 -" + substr2);
	        		
	        		
	        		char[] chars = substr1.toCharArray(); 
	        		for(char c : chars){ 
	        			int index = substr2.indexOf(c); 
	        			
	        			System.out.println(" c " + c + " index ==> " + index);
	        			
	        			if(index == -1){
	        					numChanges += 1;
	        			}
	        			
//	        			if(index != -1)
//	        			{ 
//	        				substr2 = substr2.substring(0,index) + substr2.substring(index +1, substr2.length()); 
//	        			}else
//	        			{ 
//	        					System.out.println(" In else ");
//	        			} 
	        		}

        			System.out.println(" str1 " + str1 + " numChanges " + numChanges);
	        		
//	        		for (int j=0; j< lenstr; j++){
	        			
//	        			System.out.println(substr1.);
//	        			int a = 0;
//	        			if (substr2.indexOf(substr1.indexOf(j))) {
//	        					
//	        				
//	        			}
//	        		}	
	        			
	        		
//	        		break;
	        }
		
		
	}

}
