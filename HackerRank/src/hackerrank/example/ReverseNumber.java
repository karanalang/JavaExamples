package hackerrank.example;

public class ReverseNumber {

	public int reverseNumber(int number){
		int reverse = 0;
        while(number != 0){
            reverse = (reverse*10)+(number%10);
            
            System.out.println(" reverse is " + reverse);
            
            number = number/10;
        }
        return reverse;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ReverseNumber nr = new ReverseNumber();
	        System.out.println("Result: "+nr.reverseNumber(110000));
		
		
	}

}
