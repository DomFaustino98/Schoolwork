package Lab06Starter;

/**
 * 
 * @author Dominic Faustino
 * Java166 - 001
 * Lab 6name :
 */

// ****************************************************************
// StarShip.java
//
// A class that holds a starShip's name and can make it fire Weapons.
//
// ****************************************************************

public abstract class StarShip
{
    protected String name;
	// *** PLACE ADDITIONAL INSTANCE VARIABLES HERE.
    
    protected String homeport;
    protected String captain;
    // ------------------------------------------------------------
    // Constructor -- store name
    // ------------------------------------------------------------
    // *** MODIFY THIS CONSTRUCTOR FOR THE ADDITIONAL INSTANCES VARIABLES.
	public StarShip(String name)
    {
        this.name = name;
        homeport = "Earth McKingley Station";
        captain = "Randy Pausch";
    }
    
    // ------------------------------------------------------------
    // Returns the myShip's name
    // ------------------------------------------------------------
    public String getName()
    {
        return name;
    }
    
    // ------------------------------------------------------------
    // Returns a string with the starShip's weapons volley
    // ------------------------------------------------------------
    public abstract String fireWeapon();
	
	// *** PLACE ADDITIONAL METHODS HERE.
    public String getHomePort()
    {
    	return homeport; //Returns the homeport
    }
    
    public void setHomePort(String homeport)
    {
    	this.homeport = homeport; //Assigns passed in string to homeport
    }
     
    public String getCaptain() 
    {
    	return captain; //Returns captain
    }
    
    public void setCaptain(String captain)
    {
    	this.captain = captain; //Assigns passed in string to captain
    }
    
    public abstract int getAvgCrewSize();
} 