package day7;

import java.util.Scanner;

public class theDubs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner code = new Scanner (System.in);
		
		int bye = 5;
		int hi = 10;
		int back = 0;
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
	     
	     System.out.println("This is the sum");
	   int hi1 = bye + back;
	    System.out.println(hi1);
	    
	    System.out.println("This is the difference");
	    int hi11 = bye - back;
	    System.out.println(hi11);
	    
	    System.out.println("This is the product");
	    int hi111 = bye * back;
	    System.out.println(hi111);
	    
	    System.out.println("This is the quotient");
	    int hi1111 = bye / back;
	    System.out.println(hi1111);
	    
	    System.out.println("Thank you for participating " + name );
	    
	    code.close();
	    
	    
	    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
