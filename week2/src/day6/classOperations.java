package day6;

import java.util.Scanner;

public class classOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ari = new Scanner(System.in);

		int crew = 10;
		int gang = 5;
		int love = 4;

		double c = 2.4;
		double vans = 1.5;
		double food = 4.0;

		System.out.println("Welcome to Thugga's calculator");

		System.out.println("Enter a number!");

		love = ari.nextInt();

		System.out.println("Enter a number!");

		gang = ari.nextInt();

		crew = love + gang; 

		System.out.println(crew);
		
		System.out.println("This the difference");
int crew1 = love - gang;

System.out.println(crew1);

System.out.println("This is the product");

int crew11 = love * gang;
System.out.println(crew11);

System.out.println("This is the quotient");

int crew111 = love / gang;
System.out.println(crew111);

System.out.println("Enter a number");

c = ari.nextDouble();

System.out.println("Enter a number");

vans = ari.nextDouble();

food = c + vans;

System.out.println(food);

System.out.println("This is the difference");

double food1 = c - vans;

System.out.println(food1);

System.out.println("This is the product");

double food11 = c * vans;

System.out.println(food11);

System.out.println("This is the quotient");

double food111 = c / vans;

System.out.println(food111);

ari.close();
	}

}
