//Dominic Faustino
//Prof Lieberman CMSY 166 
//Lab 5A
import java.util.Scanner;
public class Lab5A 
{
	//Constant for the number of days of the festival
	static final int DAYS = 7;

	public static void main(String[] args)
	{
		//Instantiate scanner object
		Scanner input = new Scanner(System.in);

		//Declare variables and the array to hold attendance
		int festivalArray[];
		festivalArray = new int [DAYS];

		//For loop for getting the attendants
		for (int i = 0; i < DAYS; i++)
		{
			do
			{
				System.out.print("Please enter in the number of attendants: ");
				festivalArray[i] = input.nextInt();
				if (festivalArray[i] < 0)
					//Check for negative input for the # of attendants
				{
					System.out.println("Please enter a positive value!");
				}
			} while (festivalArray[i] < 0); //do while for when the input is negative
		} //End of for loop

		input.close();
		printAttendance(festivalArray);
	} //End of main

	public static int calculateTotal(int mArray[])
	{
		int sum = 0;
		for (int i = 0; i < DAYS; i++)
		{
			int temp = 0;
			temp = mArray[i];
			sum += temp;
		}
		return sum;
	} //End of calculateTotal

	public static double calculateAverage(int mArray[])
	{
		//Method to use calculateTotal and then divide by the number of days and return the average
		int sum = calculateTotal(mArray);
		double average = (double) sum/DAYS;
		return average;
	} //End of calculateAverage

	public static int findLargest(int mArray[])
	{
		int max = mArray[0];
		int day = 0;
		//Use of a loop to check each element of the array for which is the largest
		for (int i = 0; i < DAYS; i++)
		{
			if (mArray[i] > max)
			{
				max = mArray[i];
				day = i;
			}	
		}
		return day;
	} //End of findLargest

	public static int findLeast(int mArray[])
	{
		int least = mArray[0];
		int day = 0;
		for (int i = 0; i < DAYS; i++)
		{
			if (mArray[i] < least)
			{
				least = mArray[i];
				day = i;
			}	
		}
		return day;
	} //End of findLeast

	public static void printAttendance(int mArray[])
	{
		//Display the seven days and their attendance numbers
		System.out.println("\nAttendance Report: ");
		for(int i = 0; i < DAYS; i++)
		{
			System.out.println("Day " + (i+1) + ": " + mArray[i]);
		}
		System.out.println("\nTotal attendance: " + calculateTotal(mArray));
		System.out.printf("%s%.1f", "Average attendance: ", calculateAverage(mArray));
		System.out.println("\nGreatest attendance: " + mArray[findLargest(mArray)] + " on day: " + (findLargest(mArray)+1));
		System.out.println("Lowest attendance: " + mArray[findLeast(mArray)] + " on day: " + (findLeast(mArray)+1));
	} //End of printAttendance
} //End of class
