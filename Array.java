//Dominic Faustino
//CE-Array
import java.util.Scanner;
public class Array 
{
	static final int DAYS_WEEK = 7;
	static final double PIZZA_PRICE = 8.50;

	public static void main (String[] args)
	{
		//Declare vars and array
		int pizzaArray[];
		pizzaArray = new int [DAYS_WEEK];
		int sum = 0;
		double average = 0;



		Scanner input = new Scanner(System.in);
		for (int i = 0; i < DAYS_WEEK; i++) //For loop to get input for the array
		{
			do 
			{
				System.out.print("Please enter the number of pizzas for day " + (i+1) + ": "); //Display message for the pizzas
				pizzaArray[i] = input.nextInt();
				if (pizzaArray[i] < 0)
				{
					System.out.println("Enter a positive value!"); //Error statement for negatives
				}

			} while (pizzaArray[i] < 0); //Error check for negatives
		}

		displayTitle(pizzaArray);
		sum = calcSum(pizzaArray, sum);
		average = getAverage(average, sum);
		System.out.println("The total number of pizzas sold for the week: " + sum);
		System.out.printf("The average number of pizzas sold per day: %.2f\n", average);
		System.out.printf("The total revenue for the week: $%.2f\n", (sum * PIZZA_PRICE));
		System.out.printf("The average revenue per day: $%.2f\n", ((sum * PIZZA_PRICE)/(DAYS_WEEK)));
		System.out.println("Thanks for coming and buying my pizza, have a great day!");
	} //end of main


	public static void displayTitle(int inArray[])
	{
		System.out.println("\nSales Report:\n");
		for (int i = 0; i < DAYS_WEEK; i++)
		{
			System.out.print("Day " + (i+1) + ": " + inArray[i] + "\n");
		}
	} //end of display title


	public static int calcSum(int inArray[], int inSum)
	{
		for (int i = 0; i < DAYS_WEEK; i++)
		{
			int temp = 0;
			temp = inArray[i];
			inSum += temp;
		}
		return inSum;
	} //end of calcSum
	
	
	public static double getAverage(double inAverage, double inSum)
	{
		inAverage = inSum/DAYS_WEEK;
		return inAverage;
	} //End of getAverage
	
	




}
