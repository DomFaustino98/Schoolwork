//Dominic Faustino
//Feb 15 2019
//Math

//Import the scanner
import java.util.Scanner;

public class Math {

	public static void main(String[] args) 
	{
		//Declare vars
		int var1 = 0;
		int var2 = 0;
		double double1 = 0;
		double double2 = 0;
		
		//Get scanner
		Scanner input = new Scanner(System.in);
		
		
		//Prompt user for integeter and double input, and then store it using the scanner
		System.out.print("Input integer value 1: "); 
		var1 = input.nextInt();
		System.out.print("Input integer value 2: ");
		var2 = input.nextInt();
		System.out.print("Input double value 1: " );
		double1 = input.nextDouble();
		System.out.print("Input double value 2: " );
		double2 = input.nextDouble();
		System.out.printf("%n%n");
		
		//Print out the integer math
		System.out.println("Integer output:");
		System.out.printf("%s%d%s%d%s%d%n","Adding ", var1, " and ", var2 , ": ", var1+var2);
		System.out.printf("%s%d%s%d%s%d%n","Subtracting ", var1, " and ", var2 , ": ", var1-var2);
		System.out.printf("%s%d%s%d%s%d%n","Multiplying ", var1, " and ", var2 , ": ", var1*var2);
		System.out.printf("%s%d%s%d%s%d%n","Dividing ", var1, " and ", var2 , ": ", var1/var2);
		System.out.printf("%s%d%s%d%s%d%n%n","Modding ", var1, " and ", var2 , ": ", var1%var2);
		
		//Print out the double math
		System.out.println("Double output:");
		System.out.printf("%s%.02f%s%.02f%s%.02f%n","Adding ", double1, " and ", double2 , ": ", double1+double2);
		System.out.printf("%s%.02f%s%.02f%s%.02f%n","Subtracting ", double1, " and ", double2 , ": ", double1-double2);
		System.out.printf("%s%.02f%s%.02f%s%.02f%n","Multiplying ", double1, " and ", double2 , ": ", double1*double2);
		System.out.printf("%s%.02f%s%.02f%s%.02f%n","Dividing ", double1, " and ", double2 , ": ", double1/double2);
		
		
		
		
		
		
		
		
		
		
		
	}
		
	
	
	
}
