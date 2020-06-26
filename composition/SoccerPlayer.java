//Dominic Faustino
//CE-Composition
public class SoccerPlayer 
{
	private String firstName;
	private String lastName;
	private int games;
	private CustomDate startDate;
	
	public SoccerPlayer(String mFirstName, String mLastName, int mGames, int mGoals, CustomDate mStartDate)
	{
		firstName = mFirstName;
		lastName = mLastName;
		games = mGames;
		goals = mGoals;
		startDate = mStartDate;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	public void setFirstName(String inFirstName)
	{
		firstName = inFirstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	public void setLastName(String inLastName)
	{
		lastName = inLastName;
	}
	
	public int getGames()
	{
		return games;
	}
	public void setGames(int inGames)
	{
		games = inGames;
	}
	
	
	public String toString()
	{
		return "\n" + firstName + " " + lastName + " started on the team on " + startDate + "\nThe goals per game is " + calcGoals(games, goals);
	}
	
	
} //End of SoccerPlayer