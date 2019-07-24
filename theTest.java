package Day9;

			
		import java.util.Scanner;

public class theTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scam = new Scanner(System.in);
		
		String name = "";
		System.out.println("Enter your name please.");
		name = scam.next();
	    String sport = "";
	    String food = "";
	
		System.out.println("Hello " + name + " please answer our short survey. ");
		
		System.out.println("What's your favorite sport?");
		sport = scam.next();
		
		System.out.println("What's your favorite food?");
		food = scam.next();
		
		
		System.out.println("Wow, " + sport + " is an amazing sport that I'm pretty sure you're very good at I see ");
		System.out.println(food + " is your favorite food good choice, I love " + food );
		long color = 15;
		long red = 20;
		long pink = 4;
//		long fred = 0;
//		
//		fred = scam.nextLong();
	
		
		System.out.println("Do you have any adding, subtracting, multiplying, or dividing to do? " + name);
		System.out.println(" We have a calculator, would you like to try it out? Answer with yes or no please.");
		String answer = "";
		answer = scam.next();
		
		if (answer.equalsIgnoreCase("yes")){
		
		System.out.println("Enter a number");
		color = scam.nextLong(); 
		
		System.out.println("Enter another number");
		red = scam.nextLong(); 
		
		
		
		System.out.println("This is the sum");
		 pink = red + color ;
		 System.out.println(pink);
		 
		 System.out.println("This is the difference");
		 pink = red - color;
		 System.out.println(pink);
		 
		 System.out.println("This is the product");
		 pink = color * red ;
		 System.out.println(pink);
		 
		 System.out.println("This is the quotient");
		 pink = red / color ;
		 System.out.println(pink); 
		 
		 System.out.println("Thank you for taking our survey and trying our calculator.");
		 
		} else {
				
			System.out.println("Ok thank you for your participation.");
			
			
		} 
	}

	}
	 
		 
		
		
		 
		
		
				
		
