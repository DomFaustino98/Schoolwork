//Dominic Faustino
//Feb 15 2019
//MathTest

//Import the scanner
import java.util.Scanner;

public class MathTest {

	public static void main(String[] args) 
	{
		//Declare vars
		int int1 = 0;
		int int2 = 0;
		double double1 = 0;
		double double2 = 0;
		
		//Get scanner
		Scanner input = new Scanner(System.in);
		
		//Prompt user for integer and double input, and then store it using the scanner
		System.out.print("Input integer value 1: "); 
		int1 = input.nextInt();
		System.out.print("Input integer value 2: ");
		int2 = input.nextInt();
		System.out.print("Input double value 1: " );
		double1 = input.nextDouble();
		System.out.print("Input double value 2: " );
		double2 = input.nextDouble();
		System.out.printf("%n%n");
		
		
		
		
		
		
		//Print out the integer and double math for when the first number is greater than the second and the second number is not 0
		if (int1 > int2 && int2 != 0)
		{
		System.out.println("Number 1 is greater than Number 2");
		System.out.println("Integer output:");
		System.out.printf("%s%d%s%d%s%d%n","Adding ", int1, " and ", int2 , ": ", int1+int2);
		System.out.printf("%s%d%s%d%s%d%n","Subtracting ", int1, " and ", int2 , ": ", int1-int2);
		System.out.printf("%s%d%s%d%s%d%n","Multiplying ", int1, " and ", int2 , ": ", int1*int2);
		System.out.printf("%s%d%s%d%s%d%n","Dividing ", int1, " and ", int2 , ": ", int1/int2);
		System.out.printf("%s%d%s%d%s%d%n%n","Modding ", int1, " and ", int2 , ": ", int1%int2);
		}
		
		if (double1 > double2 && double2 != 0)
		{
		System.out.println("Number 1 is greater than Number 2");
		System.out.println("Double output:");
		System.out.printf("%s%.02f%s%.02f%s%.02f%n","Adding ", double1, " and ", double2 , ": ", double1+double2);
		System.out.printf("%s%.02f%s%.02f%s%.02f%n","Subtracting ", double1, " and ", double2 , ": ", double1-double2);
		System.out.printf("%s%.02f%s%.02f%s%.02f%n","Multiplying ", double1, " and ", double2 , ": ", double1*double2);
		System.out.printf("%s%.02f%s%.02f%s%.02f%n%n","Dividing ", double1, " and ", double2 , ": ", double1/double2);
		}
		
		
		
		
		
		//Print out the integer and double math for when the second number is greater than the first number
		if (int2 > int1)
		{
		System.out.println("Number 2 is greater than Number 1");
		System.out.println("Integer output:");
		System.out.printf("%s%d%s%d%s%d%n","Adding ", int1, " and ", int2 , ": ", int1+int2);
		System.out.printf("%s%d%s%d%s%d%n","Subtracting ", int2, " and ", int1 , ": ", int2-int1);
		System.out.printf("%s%d%s%d%s%d%n","Multiplying ", int1, " and ", int2 , ": ", int1*int2);
		System.out.printf("%s%d%s%d%s%d%n","Dividing ", int1, " and ", int2 , ": ", int1/int2);
		System.out.printf("%s%d%s%d%s%d%n%n","Modding ", int1, " and ", int2 , ": ", int1%int2);
		}
		
		if (double2 > double1)
		{
		System.out.println("Number 2 is greater than Number 1");
		System.out.println("Double output:");
		System.out.printf("%s%.02f%s%.02f%s%.02f%n","Adding ", double1, " and ", double2 , ": ", double1+double2);
		System.out.printf("%s%.02f%s%.02f%s%.02f%n","Subtracting ", double2, " and ", double1 , ": ", double2-double1);
		System.out.printf("%s%.02f%s%.02f%s%.02f%n","Multiplying ", double1, " and ", double2 , ": ", double1*double2);
		System.out.printf("%s%.02f%s%.02f%s%.02f%n%n","Dividing ", double1, " and ", double2 , ": ", double1/double2);
		}
		
		
		
		
		
		//Print out the integer and double math for when the two numbers are equal
		if (int1 == int2)
		{
		System.out.println("Number 1 is equal to Number 2");
		System.out.println("Integer output:");
		System.out.printf("%s%d%s%d%s%d%n","Adding ", int1, " and ", int2 , ": ", int1+int2);
		System.out.println("Two equal numbers will equal zero when subtracted");
		System.out.printf("%s%d%s%d%s%d%n","Subtracting ", int1, " and ", int2 , ": ", int1-int2);
		System.out.printf("%s%d%s%d%n","Squaring ", int1, ": ", int1*int2);
		System.out.printf("%s%d%s%d%s%d%n","Dividing ", int1, " and ", int2 , ": ", int1/int2);
		System.out.printf("%s%d%s%d%s%d%n%n","Modding ", int1, " and ", int2 , ": ", int1%int2);
		}
		
		
		if (double1 == double2)
		{
		System.out.println("Number 1 is equal to Number 2");
		System.out.println("Double output:");
		System.out.printf("%s%.02f%s%.02f%s%.02f%n","Adding ", double1, " and ", double2 , ": ", double1+double2);
		System.out.println("Two equal numbers will equal zero when subtracted");
		System.out.printf("%s%.02f%s%.02f%s%.02f%n","Subtracting ", double1, " and ", double2 , ": ", double1-double2);
		System.out.printf("%s%.02f%s%.02f%n","Squaring ", double1, ": ", double1*double2);
		System.out.printf("%s%.02f%s%.02f%s%.02f%n%n","Dividing ", double1, " and ", double2 , ": ", double1/double2);
		}
		
		
		
		//Print out the integer and double math for when the second number is 0
		if (int2 == 0)
		{
		System.out.println("Number 2 is zero");
		System.out.println("Integer output:");
		System.out.printf("%s%d%s%d%s%d%n","Adding ", int1, " and ", int2 , ": ", int1+int2);
		System.out.printf("%s%d%s%d%s%d%n","Subtracting ", int1, " and ", int2 , ": ", int1-int2);
		System.out.printf("%s%d%s%d%s%d%n","Multiplying ", int1, " and ", int2 , ": ", int1*int2);
		System.out.printf("%s%n%n" , "Cannot divide or mod by 0");
		}
		
		if (double2 == 0)
		{
		System.out.println("Number 2 is zero");
		System.out.printf("%s%n", "Double output:");
		System.out.printf("%s%.02f%s%.02f%s%.02f%n","Adding ", double1, " and ", double2 , ": ", double1+double2);
		System.out.printf("%s%.02f%s%.02f%s%.02f%n","Subtracting ", double1, " and ", double2 , ": ", double1-double2);
		System.out.printf("%s%.02f%s%.02f%s%.02f%n","Multiplying ", double1, " and ", double2 , ": ", double1*double2);
		System.out.printf("%s%n%n" , "Cannot divide or mod by 0");
		}
		
		
		
		
	}
		
	
	
	
}
