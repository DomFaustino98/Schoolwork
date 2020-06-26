package Lab06Starter;

/**
 *
 * @author Dominic Faustino
 * Java166 - 001
 * Lab 6
 */
// ****************************************************************
// Constitution.java
//
// A class derived from StarShip that holds information about
// a Constitution class starship. Overrides StarShip fireWeapon method.
//
// ****************************************************************
public class Constitution extends StarShip
{
	// *** PLACE ADDITIONAL INSTANCE VARIABLE HERE.
	protected int percentCharge;
	private int crewSize = 430;

	public Constitution(String name)
	{
		super(name);
		// *** MODIFY THIS CONSTRUCTOR TO ACCOMMODATE THE NEW INSTANCE VARIABLE.
		percentCharge = 100;
	}

	// ------------------------------------------------------------
	// standard phasers -- overrides fireWeapon method in StarShip
	// ------------------------------------------------------------
	@Override
	public String fireWeapon()
	{
		// *** MODIFY THIS METHOD TO MODEL PHASER DRAIN.
	 
		//30% drain per shot

		if (percentCharge > 30)
		{
			percentCharge = percentCharge - 30; 
			return "Phaser #1 - FIRE!" + "\nRemaining Charge: " + getPercentCharge() + "%";

		}
		else if (percentCharge > 0 && percentCharge <= 30) 
		{
			percentCharge = percentCharge - 30; 
			return "Phaser #1 - FIRE! \n*** Phaser Banks Exhausted ***";
		}
		else
		{
			percentCharge = percentCharge - 30; 
			return "*** Phaser Banks Exhausted ***";
		}
	}

	// *** ADD APPROPRIATE ACCESSOR METHODS FOR THE NEW INSTANCE VARIABLE.
	public int getPercentCharge()
	{
		return percentCharge;
	}
	
	@Override
	public int getAvgCrewSize()
	{
		return crewSize;
	}

}