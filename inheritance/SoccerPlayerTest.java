//Dominic Faustino
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
		int tempSaves;
		int tempTackles;
		boolean tempRedCard;
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
		Forward player1 = new Forward(tempFName, tempLName, tempGames, customDate1, tempGoals);
		System.out.print(player1.toString());

		System.out.println("\n");

		System.out.print("Please enter player 2's first name: ");
		tempFName = input.nextLine();
		System.out.print("Please enter player 2's last name: ");
		tempLName = input.nextLine();
		System.out.print("Please enter player 2's number of games: ");
		tempGames = input.nextInt();
		System.out.print("Please enter player 2's number of saves: ");
		tempSaves = input.nextInt();
		System.out.print("Please enter the month player 2 started: ");
		tempMonth = input.nextInt();
		System.out.print("Please enter the day player 2 started: ");
		tempDay = input.nextInt();
		System.out.print("Please enter the year player 2 started: ");
		tempYear = input.nextInt();
		error = input.nextLine();

		CustomDate customDate2 = new CustomDate(tempMonth, tempDay, tempYear);
		Goalie player2 = new Goalie(tempFName, tempLName, tempGames, customDate2, tempSaves);
		System.out.print(player2.toString());

		System.out.println("\n");

		System.out.print("Please enter player 3's first name: ");
		tempFName = input.nextLine();
		System.out.print("Please enter player 3's last name: ");
		tempLName = input.nextLine();
		System.out.print("Please enter player 3's number of games: ");
		tempGames = input.nextInt();
		System.out.print("Please enter player 3's number of tackles: ");
		tempTackles = input.nextInt();
		System.out.print("Please true or false if the player has a red card or not: ");
		tempRedCard = input.nextBoolean();
		System.out.print("Please enter the month player 3 started: ");
		tempMonth = input.nextInt();
		System.out.print("Please enter the day player 3 started: ");
		tempDay = input.nextInt();
		System.out.print("Please enter the year player 3 started: ");
		tempYear = input.nextInt();
		error = input.nextLine();

		CustomDate customDate3 = new CustomDate(tempMonth, tempDay, tempYear);
		Defender player3 = new Defender(tempFName, tempLName, tempGames, customDate3, tempTackles, tempRedCard);
		System.out.print(player3.toString());

		System.out.println("\n");

		System.out.print("Please enter player 4's first name: ");
		tempFName = input.nextLine();
		System.out.print("Please enter player 4's last name: ");
		tempLName = input.nextLine();
		System.out.print("Please enter player 4's number of games: ");
		tempGames = input.nextInt();
		System.out.print("Please enter player 4's number of tackles: ");
		tempTackles = input.nextInt();
		System.out.print("Please true or false if the player has a red card or not: ");
		tempRedCard = input.nextBoolean();
		System.out.print("Please enter the month player 4 started: ");
		tempMonth = input.nextInt();
		System.out.print("Please enter the day player 4 started: ");
		tempDay = input.nextInt();
		System.out.print("Please enter the year player 4 started: ");
		tempYear = input.nextInt();
		error = input.nextLine();

		CustomDate customDate4 = new CustomDate(tempMonth, tempDay, tempYear);
		Defender player4 = new Defender(tempFName, tempLName, tempGames, customDate4, tempTackles, tempRedCard);
		System.out.print(player4.toString());
	}
}