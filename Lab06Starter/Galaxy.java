package Lab06Starter;

/**
 *
 * @author Dominic Faustino
 * Java166 - 001
 * Lab 6
 */
// ****************************************************************
// Galaxy.java
//
// A class derived from StarShip that holds information about
// an advanced StarShip of the Galaxy class of vessels. Overrides StarShip 
// fireWeapon method and includes additional information about 
// this specialized class of StarShip.
//
// ****************************************************************
public class Galaxy extends StarShip
{
	private int crewSize = 1012;
	// *** PLACE ADDITIONAL INSTANCE VARIABLES HERE.
	protected int numTorpedoes = 32;
	protected String sponsor; 


	public Galaxy(String name, String captain, String sponsor)
	{
		super (name);
		this.name = name;
		this.captain = captain;
		this.sponsor = sponsor;
		// *** ADD CODE TO INITIALIZE THE NEW INSTANCE VARIABLES
	}

	// ------------------------------------------------------------
	// advanced weaponry -- overrides fireWeapon method in StarShip
	// ------------------------------------------------------------
	@Override
	public String fireWeapon()
	{
		
		// *** MODIFY THIS METHOD TO MODEL TORPEDO EXPENDITURES.
		if (numTorpedoes > 10)
		{
			numTorpedoes = numTorpedoes - 10;
			return "Photon Torpedoes, Full Spread - FIRE!" + "\nRemaining Torpedoes: "  + getNumTorpedoes();
		}
		else if (numTorpedoes > 0 && numTorpedoes <= 10)
		{
			numTorpedoes = numTorpedoes - 10;
			return "Photon Torpedoes, Full Spread - FIRE! \n *** All Photon Torpedoes Expended ***";
		}
		else
		{
			numTorpedoes = numTorpedoes - 10;
			return "*** All Photon Torpedoes Expended ***";
		}

	}

	// ------------------------------------------------------------
	// Returns average crew complement
	// ------------------------------------------------------------
	@Override
	public int getAvgCrewSize()
	{
		return crewSize;
	}

	// *** PLACE ADDITIONAL METHODS HERE.
	public int getNumTorpedoes()
	{
		return numTorpedoes;
	}
} 