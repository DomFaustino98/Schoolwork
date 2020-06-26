/**
 * @author Dominic Faustino
 * CSMY-166-050
 * Lab 1 - Calculates the quadratic formula from uyser input at the keyboard
 */




import java.lang.Math; 
import java.util.Scanner;

public class QuadFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in); //Scanner
		
		//Declare variables
		double a; 
		double b;
		double c;
		double x1;
		double x2;
		double discriminant;
		double root;
		
		//Get values for a, b, and c
		System.out.print("Please enter a value for a: ");
		a = input.nextDouble();
		System.out.print("Please enter a value for b: ");
		b = input.nextDouble();
		System.out.print("Please enter a value for c: ");
		c = input.nextDouble();
		
		//Make a double for the radicand value 
		discriminant = ((b * b) - 4*a*c);
		
		//Find the square root and assign it to root
		root = Math.sqrt(discriminant);
		
		//Solve
		x1 = ((-1 * b) + root) / (2*a);
		x2 = ((-1 * b) - root) / (2*a);

		//For when discriminant is greater than 0
		if (discriminant > 0)
		{
			System.out.printf("%n%s%f", "The first root is: ", x1);
			System.out.printf("%n%s%f", "The second root is: ", x2);
			//Results are displayed on 2 lines here
		}
		
		//For when discriminant is equal to 0
		if (discriminant == 0)
		{
		System.out.printf("%n%s%f", "The root is: ", x1);
		}
		
		//For when discriminant is less than 0
		if (discriminant < 0)
		{
			System.out.println("There are no roots.");
		}
		
		
	} //end of Main function

} //end of class QuadFunction
