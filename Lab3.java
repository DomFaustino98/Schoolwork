/*
 * Dominic Faustino
 * CMSY166 001
 * 
 */
import java.util.Scanner;
public class Lab3 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int hoCoCount = 0;
		int notHoCoCount = 0;
		char keepAddChoice = 'z';
		char hocoResident = 'z';
		int age = 0;
		int childrenAgeCount = 0;
		int adultsAgeCount = 0;
		int seniorsAgeCount = 0;
		
		
		Scanner input = new Scanner(System.in);
do
{
	do
	{
		System.out.println("Would you like to add an attendee?");
		keepAddChoice = input.next().charAt(0); 
		if (Character.isLetter(keepAddChoice) == false)
		{
			System.out.println("Please enter a character");
		}
		if (keepAddChoice != 'n' && keepAddChoice  != 'N' && keepAddChoice  != 'y' && keepAddChoice  != 'Y')
		{
			System.out.println("Please enter Y, y, N, or n");
		}
		else if (keepAddChoice == 'Y' || keepAddChoice == 'y')
		{
			do
			{
			//Ask if they're a hoco resident
			//Counters
			System.out.println("Is the attendee Howard County resident?");
			hocoResident = input.next().charAt(0);
			if (Character.isLetter(keepAddChoice) == false)
			{
				System.out.println("Please enter a character");
			}
			if (hocoResident != 'n' && hocoResident  != 'N' && hocoResident  != 'y' && hocoResident  != 'Y')
			{
				System.out.println("Please enter Y, y, N, or n");
			}
			else if (hocoResident == 'Y' || hocoResident == 'y')
			{
				hoCoCount = hoCoCount + 1;
			
			}
			else if (hocoResident == 'N' || hocoResident == 'n')
			{
				notHoCoCount = notHoCoCount + 1;
			}
		
			} while (Character.isLetter(keepAddChoice) == false || hocoResident != 'n' && hocoResident  != 'N' && hocoResident  != 'y' && hocoResident  != 'Y');
			
			
			do 
			{
				//Ask for the age
				System.out.println("Please enter the attendee's age");
				age = input.nextInt();
				
				if (age <18)
				{
					childrenAgeCount = childrenAgeCount + 1;
				}
				
				//Increment the age counters
				else if (age > 17 && age < 65)
				{
					adultsAgeCount = adultsAgeCount + 1;	
				}
				else if (age > 64 && age <120)
				{
					seniorsAgeCount = seniorsAgeCount + 1;
				}
				else 
				{
					System.out.println("Please enter a value between 1 and 120");
				}
			} while (age < 0 || age > 120);
			
		}
	} while (Character.isLetter(keepAddChoice) == false);
} while (keepAddChoice != 'n' && keepAddChoice != 'N');
		
		//Display the stats when the loop is exited
System.out.printf("%s%d%n", "Attendees: ", hoCoCount + notHoCoCount);
System.out.printf("%s%d%n", "Howard County Residents: ", hoCoCount);
System.out.printf("%s%d%n", "Non-Howard County Residents: ", notHoCoCount);
System.out.printf("%s%d%n", "Children: ", childrenAgeCount);
System.out.printf("%s%d%n", "Adults: ", adultsAgeCount);
System.out.printf("%s%d%n", "Seniors: ", seniorsAgeCount);
		
		
		
	}

}


