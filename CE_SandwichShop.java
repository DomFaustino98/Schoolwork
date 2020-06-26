/*
 * Dominic Faustino
 * March 11 2019
 * CE Sandwich Shop
 */

import java.util.Scanner;
public class CE_SandwichShop {
	
	static double SANDWICH_PRICE = 3.50;
	static double SANDWICH_PRICE_BULK = 2.75;
	static double SALAD_PRICE = 4.50;
	static double SALAD_PRICE_BULK = 3.75;
	static double PLATTER_PRICE = 6.50;
	static double PLATTER_PRICE_BULK = 5.75;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		//Variables
		int choice = 0;
		int sandCount = 0;
		int saladCount = 0;
		int platterCount = 0;
		
		//Menu that displays until input is 4
		do 
		{
			System.out.println("Welcome to the Quad Cafe");
			System.out.println("\n1. Sandwich");
			System.out.println("2. Salad");
			System.out.println("3. Platter");
			System.out.println("4. Quit");
			System.out.print("\nPlease make a selection: ");
			choice = input.nextInt();
			if (choice < 1 || choice > 4)
			{
				System.out.println("Please enter a number 1 through 4!");
			}
			
			//Choice for sandwich
			if (choice == 1)
			{
				do 
				{
				System.out.println("How many sandwiches would you like?");
				sandCount = input.nextInt();
				if (sandCount <= 0)
				{
					System.out.println("Please enter a positive number!");
				}
				if (sandCount > 0 && sandCount < 3)
				{
					System.out.printf("%s%.2f\n", "The cost per sandwich is $", SANDWICH_PRICE);
					System.out.printf("%s%.2f\n\n", "The cost is $", (double) (sandCount*SANDWICH_PRICE));
				}
				else if (sandCount > 2)
				{
					System.out.printf("%s%.2f\n", "The cost per sandwich is $", SANDWICH_PRICE_BULK);
					System.out.printf("%s%.2f\n\n", "The cost is $",(double) (sandCount*SANDWICH_PRICE_BULK));
				}
				} 
				while (sandCount < 0);
			}
			
			//Choice for salad
			if (choice == 2)
			{
				do 
				{
				System.out.println("How many salads would you like?");
				saladCount = input.nextInt();
				if (saladCount <= 0)
				{
					System.out.println("Please enter a positive number!");
				}
				if (saladCount > 0 && saladCount < 3)
				{
					System.out.printf("%s%.2f\n", "The cost per salad is $", SALAD_PRICE);
					System.out.printf("%s%.2f\n\n", "The cost is $", (double) (saladCount*SALAD_PRICE));
				}
				else if (saladCount > 2)
				{
					System.out.printf("%s%.2f\n", "The cost per salad is $", SALAD_PRICE_BULK);
					System.out.printf("%s%.2f\n\n", "The cost is $",(double) (saladCount*SALAD_PRICE_BULK));
				}
				} 
				while (saladCount < 0);
			}
			
			//Choice for platter
			if (choice == 3)
			{
				do 
				{
				System.out.println("How many platters would you like?");
				platterCount = input.nextInt();
				if (platterCount <= 0)
				{
					System.out.println("Please enter a positive number!");
				}
				if (platterCount > 0 && platterCount < 3)
				{
					System.out.printf("%s%.2f\n", "The cost per platter is $", PLATTER_PRICE);
					System.out.printf("%s%.2f\n\n", "The cost is $", (double) (platterCount*PLATTER_PRICE));
				}
				else if (platterCount > 2)
				{
					System.out.printf("%s%.2f\n", "The cost per platter is $", PLATTER_PRICE_BULK);
					System.out.printf("%s%.2f\n\n", "The cost is $",(double) (platterCount*PLATTER_PRICE_BULK));
				}
				} 
				while (platterCount < 0);
			}
		}
		while (choice != 4);
		
		System.out.println("\nThanks for coming, have a great day!");
		
		
	}

}
