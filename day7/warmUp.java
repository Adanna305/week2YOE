package day7;

import java.util.Scanner;

public class warmUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner thug = new Scanner (System.in);
		
		int blue = 4;
		int red = 5;
		int pink = 4;
		String yellow = "";
		
		
		System.out.println("Welcome to the Magic calculator");
		
		System.out.println("Enter a name");
		yellow = thug.next();
		
		System.out.println("Enter a number");
		 
		pink = thug.nextInt();
		
		System.out.println("Enter a number");
		
		blue= thug.nextInt();
		
		System.out.println("This is the sum");
		
		red= pink + blue;
		
		System.out.println(red);
		
		System.out.println("This is the difference");
		
		int red1 = pink - blue;
		
		System.out.println(red1);
		
		System.out.println("This is the product");
		
		int red11 = pink * blue;
		
		System.out.println(red11);
		
		System.out.println("This is the quotient");
		
		int red111 = pink / blue;
		
		System.out.println(red111);
		
	
		
		System.out.println("Thank you for participating " + yellow);
	
	thug.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
