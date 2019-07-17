package day7;

import java.util.Scanner;

public class theDubs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner code = new Scanner (System.in);
		
		int bye = 5;
		int hi = 10;
		int back = 0;
		int be = 2;
		String name = "";
		String color = "";
		
		
		System.out.println("Welcome to Dub's calculator");
		 
		System.out.println("Enter your name");
		name = code.next();//string
		
		System.out.println("Enter your favorite color");
		color = code.next();//string
		
		System.out.println("Enter a number");
		bye = code.nextInt();
		
		System.out.println("Enter a number");
	     back = code.nextInt();
		   
	     int hi1 = bye + back;

	     System.out.println("This is the sum " + hi1);
	    
	    
	    int hi11 = bye - back;
	    System.out.println("This is the difference " + hi11);
	    
	    int hi111 = bye * back;
	    System.out.println("This is the product " + hi111);
	    
	    int hi1111 = bye / back;
	    System.out.println("This is the quotient " + hi1111);
	    
	    System.out.println("Thank you for participating " + name + ". Please rate Dub's calculator on a scale of 1 to 5.");
	    
	   int be1 = code.nextInt();
	   
	   System.out.println("Thank you " + name + " for rating Dub's calculator a " + be1 + ", your rating is very appreciated.");
	    
	   code.close();
	   
	    
	    
	    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
