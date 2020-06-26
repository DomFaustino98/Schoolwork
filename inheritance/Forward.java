//Dominic Faustino
public class Forward extends SoccerPlayer
{
	protected int goalsScored;
	protected double avgGoals;

	public Forward(String mFirstName, String mLastName, int mGames, CustomDate mDate, int mGoalsScored)
	{
		super(mFirstName, mLastName, mGames, mDate);
		goalsScored = mGoalsScored;
	}

	public int getGoals()
	{
		return goalsScored;
	}
	public void setGoals(int inGoals)
	{
		goalsScored = inGoals;
	}

	public double calcGoals(int mGames, int mGoals)
	{
		if (mGames == 0)
		{
			avgGoals = 0;
			return avgGoals;
		}
		else 
		{
		double avgGoals;
		avgGoals = (double) mGoals/mGames;
		return avgGoals;
		}
	}
	
	@Override
	public String toString()
	{
		return String.format("%s %s scored %d goals with an average of %.1f goals per game", getFirstName(), getLastName(), getGoals(), calcGoals(games, goalsScored));
	}


} //End of Forward