/*
 * Dominic Faustino
 * March 8, 2019
 * CMSY166 - 001
 * Lab 2A
 */

public class Volunteer 
{

	//Instance variables
	private String firstName;
	private String lastName;
	private int numHours;
	

	//Default constructor
	public Volunteer() 
	{
		firstName = "null";
		lastName = "null";
		numHours = 0;
	}
	
	//Custom constructor for a volunteer
	public Volunteer(String inFName, String inLName, int inHours)
	{
		firstName = inFName;
		lastName = inLName;
		numHours = inHours;
	}
		
	//Get and set functions for the name
	public String getName() 
	{
		return firstName + " " + lastName;
	}
	
	public void setFirstName(String inFName) 
	{
		firstName = inFName;
	}
	
	public void setLastName(String inLName)
	{
		lastName = inLName;
	}
	
	//Get and set functions for the hours available
	public int getHoursAvailable()
	{
		return numHours;
	}
	
	public void setHoursAvailable(int inHours)
	{
		numHours = inHours;
	}
	
	
	

} //End of class



