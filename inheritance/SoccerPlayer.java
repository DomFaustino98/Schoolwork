//Dominic Faustino
public class SoccerPlayer 
{
protected String firstName;
protected String lastName;
protected int games;
protected int goals;
protected CustomDate startDate;
	
public SoccerPlayer(String mFirstName, String mLastName, int mGames, CustomDate mStartDate)
{
	firstName = mFirstName;
	lastName = mLastName;
	games = mGames;
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
	return "\n" + firstName + " " + lastName + " started on the team on " + startDate + " and has played " + games;
}

} //End of SoccerPlayer
