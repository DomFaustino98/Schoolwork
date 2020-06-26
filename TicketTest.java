//Dominic Faustino
//CMSY 166 001
//March 29 2019
import java.util.Scanner;
public class TicketTest 
{

	//Finals for yes and no strings
	final static String NO = "no"; 
	final static String YES = "yes";
	final static int ONE = 1;
	final static int TWO = 2;

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		String memberChoice; //input variable
		int menuChoice; //menu variable to continue inputting
		String ws; //string variable to consume the \n character for get lines

		do 
		{ 
			System.out.println("1. Add a new attendee");
			System.out.println("2. Quit");
			System.out.print("\nEnter your choice: ");
			menuChoice = input.nextInt();
			ws = input.nextLine(); 
			
			if (menuChoice != ONE && menuChoice != TWO)
			{
				System.out.println("Please enter 1 or 2"); //Validation for the menu
			}

			else if (menuChoice == ONE)
			{
				do 
				{
					//Ask the user if they belong to the CA
					//if yes, call method to return a string for the type of ticket VIP
					//if no, ask them for donation
					
					System.out.print("Are you a member of the Columbia Association (CA): ");
					memberChoice = input.nextLine();

					if (memberChoice.equals(YES)) //check if the input == yes
					{
						String answerYes;
						answerYes = ticketType();
						System.out.println("Your ticket type is " + answerYes);
						System.out.println();
					} //If statement to display the ticket type VIP when the member belongs to the CA
					else if (memberChoice.equals(NO)) //check if the input == no
					{
						String answerNo;
						answerNo = ticketType(input);
						System.out.println("Your ticket type is " + answerNo);
						System.out.println();
					}
					else
					{
						System.out.println("Please enter one word: yes or no"); //validation for strings
					}
				} while (memberChoice.equals(NO) && memberChoice.equals(YES)); //End of do while statement
			} //End of choice 1 of menu to add a new attendee
			
			else 
			{
				System.out.println("Thanks, have a good day");
			}
		} while (menuChoice != TWO);
	}

	public static String ticketType() //Method for CA members to return VIP string
	{
		String VIP = "VIP";
		return VIP;
	}

	public static String ticketType(Scanner input) //Method for non-CA members to return their type of ticket string
	{
		int customAmount;
		String ticket;
		System.out.println("Please enter your donation amount");
		customAmount = input.nextInt();
		switch(customAmount) //Switch statement for the different types of donation amounts
		{
		case (5):
			ticket = "Attendee";
		break;
		case 10:
			ticket = "Bronze";
			break;
		case 50:
			ticket = "Silver";
			break;
		case 100:
			ticket = "Gold";
			break;
		default: 
			ticket = "Custom";
			break;
		} //End of switch statement
		return ticket; //Return the string outside of the switch statement
	} 
}









