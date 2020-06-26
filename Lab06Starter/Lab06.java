package Lab06Starter;

/**
 *
 * @author Dominic Faustino
 * Java166 - 001
 * Lab 6
 */
public class Lab06 {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args)
	{
		//StarShip myShip = new StarShip("Orville");
		//  System.out.println("\n" + myShip.getName() 
		//				+ " says " + myShip.fireWeapon());

		//Have to comment out all of this ^ because StarShip cannot be instantiated
		
		// *** PLACE ADDITIONAL STATEMENTS PER PART II HERE.


		// STEP 1: Instantiate one of each subclass and fire weapon
		Galaxy galaxy1 = new Galaxy("USS Defiant", "Dr. Leah Brahms", "Jean-Luc Picard");
		Constitution constitution1 = new Constitution("USS Enterprise");


		// 1.a. Create and fire weapons for a Constitution starship
		System.out.println("\n" + constitution1.getCaptain() + " commanding " + constitution1.getName() + " says " + constitution1.fireWeapon());   


		// 1.b. Create and fire weapons for a Galaxy starship
		System.out.println("\n" + galaxy1.getCaptain() + " commanding " + galaxy1.getName() + " says " + galaxy1.fireWeapon());   


		// STEP 3: Print average crew size

		// 3.a. Print average crew size for Constitution starship
		System.out.println("\nFor " + constitution1.getName() + " the average crew size is: " + constitution1.getAvgCrewSize());

		// 3.b. Print average crew size for Galaxy starship
		System.out.println("\nFor " + galaxy1.getName() + " the average crew size is: " + galaxy1.getAvgCrewSize());


		// STEP 7: Fire all weapons
		System.out.println("\n*** COMMENCE FIRE. Fire at will. ***");

		// 7.a. Fire phasers until exhaustion (Constellation)
		while (constitution1.getPercentCharge() >= 0)
		{
			System.out.println("\n" + constitution1.getCaptain() + " commanding " + constitution1.getName() + " says " + constitution1.fireWeapon());
		}
			

		System.out.println("\n");
		// 7.b. Launch torpedo salvos until all torpedoes expended. (Galaxy)
		while (galaxy1.getNumTorpedoes() >= 0)
		{
			System.out.println("\n" + galaxy1.getCaptain() + " commanding " + galaxy1.getName() + " says " + galaxy1.fireWeapon());
		}



	}
}
