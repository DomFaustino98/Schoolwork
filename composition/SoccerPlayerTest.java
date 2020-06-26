//Dominic Faustino
//CE-Composition
import java.util.Scanner;
public class SoccerPlayerTest 
{
	public static void main(String[] args)
	{
	String tempFName;
	String tempLName;
	int tempGames;
	int tempGoals;
	int tempMonth;
	int tempDay;
	int tempYear;
	String error;
	Scanner input = new Scanner(System.in);
	
	System.out.print("Please enter player 1's first name: ");
	tempFName = input.nextLine();
	System.out.print("Please enter player 1's last name: ");
	tempLName = input.nextLine();
	System.out.print("Please enter player 1's number of games: ");
	tempGames = input.nextInt();
	System.out.print("Please enter player 1's number of goals: ");
	tempGoals = input.nextInt();
	System.out.print("Please enter the month player 1 started: ");
	tempMonth = input.nextInt();
	System.out.print("Please enter the day player 1 started: ");
	tempDay = input.nextInt();
	System.out.print("Please enter the year player 1 started: ");
	tempYear = input.nextInt();
	error = input.nextLine();
	
	CustomDate customDate1 = new CustomDate(tempMonth, tempDay, tempYear);
	SoccerPlayer player1 = new SoccerPlayer(tempFName, tempLName, tempGames, tempGoals, customDate1);
	System.out.print(player1.toString());
	
	System.out.println("\n");
	
	System.out.print("Please enter player 2's first name: ");
	tempFName = input.nextLine();
	System.out.print("Please enter player 2's last name: ");
	tempLName = input.nextLine();
	System.out.print("Please enter player 2's number of games: ");
	tempGames = input.nextInt();
	System.out.print("Please enter player 2's number of goals: ");
	tempGoals = input.nextInt();
	System.out.print("Please enter the month player 2 started: ");
	tempMonth = input.nextInt();
	System.out.print("Please enter the day player 2 started: ");
	tempDay = input.nextInt();
	System.out.print("Please enter the year player 2 started: ");
	tempYear = input.nextInt();
	
	CustomDate customDate2 = new CustomDate(tempMonth, tempDay, tempYear);
	SoccerPlayer player2 = new SoccerPlayer(tempFName, tempLName, tempGames, tempGoals, customDate2);
	System.out.print(player2.toString());
	
	
	}
}