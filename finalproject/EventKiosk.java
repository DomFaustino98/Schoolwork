/*
 * Dominic Faustino
 * CMSY166-001
 * Final Project
 */
import java.util.ArrayList;
import java.util.Scanner;

public class EventKiosk {

	public static void main (String[] args)
	{

		ArrayList<Phone> newCustomers = new ArrayList<>();
		Scanner keyboardInput = new Scanner( System.in );

		boolean memberCA;
		String newPhone;
		String newCarrier;
		char c; //character for input
		char d; //another character for input
		String cleanUp; //string to grab new line inputs hanging on the keyboard buffer

		do 
		{
			System.out.println("Is there a customer wanting to buy a new phone? (Y/N):  " );
			c = keyboardInput.next().charAt(0);
			cleanUp = keyboardInput.nextLine();
			if (Character.toUpperCase(c) == 'Y')
			{
				do //Do while statement to check for error in CA membership status
				{
					System.out.println("Is the customer a CA member? (Y/N):  ");
					d = keyboardInput.next().charAt(0);
					cleanUp = keyboardInput.nextLine();
					if (d != 'y' && d != 'Y' && d != 'n' && d != 'N' )
					{
						System.out.println("Please enter Y or N");
					}
					memberCA = ( d == 'y' || d == 'Y' );
				} while (d != 'y' && d != 'Y' && d != 'n' && d != 'N');

				do //Do while statement to check for error in phone type
				{
					System.out.println("What type of phone (iPhone, Android, or Moto):  ");
					newPhone = keyboardInput.nextLine();
					if (!newPhone.equals("iPhone") && !newPhone.equals("Android") && !newPhone.equals("Moto"))
					{
						System.out.println("Please enter iPhone, Android, or Moto");
					}
				} while (!newPhone.equals("iPhone") && !newPhone.equals("Android") && !newPhone.equals("Moto"));


				do //Do while to check for error in carrier 
				{
					System.out.println("What carrier? (Verizon, AT&T, or T-Mobile):  ");
					newCarrier = keyboardInput.nextLine();
					if (!newCarrier.equals("Verizon") && !newCarrier.equals("AT&T") && !newCarrier.equals("T-Mobile")) 
					{
						System.out.println("Please enter Verizon, AT&T, or T-Mobile");
					}
				} while (!newCarrier.equals("Verizon") && !newCarrier.equals("AT&T") && !newCarrier.equals("T-Mobile"));
					switch ( newPhone ) 
					{
					case "iPhone": 
					{
						Phone nextPhone = new IPhone(newCarrier);
						nextPhone.initialize(newCarrier, memberCA);
						newCustomers.add( nextPhone  );
						break;
					}
					case "Android": 
					{
						Phone nextPhone = new Android(newCarrier);
						nextPhone.initialize(newCarrier, memberCA);
						newCustomers.add( nextPhone  );
						break;
					}
					case "Moto": 
					{
						Phone nextPhone = new Moto(newCarrier);
						nextPhone.initialize(newCarrier, memberCA);
						newCustomers.add( nextPhone );
						break;
					}
					 //Default has been deleted because the error checking won't allow invalid values to get this far
					} //end of switch
				

			} //End of if statement for case 'Y'
			else if (Character.toUpperCase(c) != 'Y' && Character.toUpperCase(c) != 'N')
			{
				System.out.println("Please enter Y or N");
			}
		} while (Character.toUpperCase(c) != 'N');


		keyboardInput.close(); //Close Keyboard Input for good measures

		printReport( newCustomers );

	} //End of main

	public static void printReport( ArrayList<Phone> newCustomers ) {

		System.out.printf("%s%n%s%n%s%n%n",
				"==========================================================",
				"=       Columbia 50th Annversary Phone Signup Drive      =",
				"==========================================================" );

		System.out.println("New Customers:\n");

		for ( Phone phone : newCustomers ) {
			System.out.printf("%s%n", phone.toString() );
		}


	}

} //End of class EventKiosk
