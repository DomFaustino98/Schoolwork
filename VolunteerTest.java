/*
 * Dominic Faustino
 * March 8, 2019
 * CMSY166 - 001
 * Lab 2A
 */
public class VolunteerTest {

	public static void main(String[] args) {
		// THIS CODE MUST NOT BE CHANGED IN ANY WAY!!!
		
		// The code below will be used to test the Volunteer class 
		// created by the students for Lab 3.
		
		// THIS CODE MUST NOT BE CHANGED IN ANY WAY!!!
		
		// Use constructors to create an empty volunteer object
		// and an object containing data
		Volunteer volunteer1 = new Volunteer();
		Volunteer volunteer2 = new Volunteer("Bill", "Gates", 5);
		
		//Display the initial values in the objects
		System.out.printf("volunteer1 name is : %s%n", volunteer1.getName());
		System.out.printf("volunteer1 hours available is : %s%n%n", volunteer1.getHoursAvailable());
		System.out.printf("volunteer2 name is : %s%n", volunteer2.getName());
		System.out.printf("volunteer2 hours available is : %s%n%n", volunteer2.getHoursAvailable());
		
		
		//Update the objects
		volunteer1.setFirstName("Melinda");
		volunteer1.setLastName("Gates");
		volunteer1.setHoursAvailable(10);
		volunteer2.setHoursAvailable(7);
		
		//Display the updated values in the objects
		System.out.printf("volunteer1 name is : %s%n", volunteer1.getName());
		System.out.printf("volunteer1 hours available is : %s%n%n", volunteer1.getHoursAvailable());
		System.out.printf("volunteer2 name is : %s%n", volunteer2.getName());
		System.out.printf("volunteer2 hours available is : %s%n%n", volunteer2.getHoursAvailable());
				
	} // end of main

} // end of class
