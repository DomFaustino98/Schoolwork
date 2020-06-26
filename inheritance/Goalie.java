 //Dominic Faustino
public class Goalie extends SoccerPlayer
{
	protected int savesMade;
	protected double avgSaves;
	
	public Goalie(String mFirstName, String mLastName, int mGames, CustomDate mDate, int mSavesMade)
	{
		super(mFirstName, mLastName, mGames, mDate);
		savesMade = mSavesMade;
	}
	
	public int getSaves()
	{
		return savesMade;
	}
	public void setSaves(int inSaves)
	{
		savesMade = inSaves;
	}
	
	public double calcSaves(int mGames, int mSaves)
	{
		if (mGames == 0)
		{
			avgSaves = 0;
			return avgSaves;
		}
		else
		{
		double avgSaves = 0;
		avgSaves = (double) mSaves/mGames;
		return avgSaves;
		}

	}
	
	@Override
	public String toString()
	{
		return String.format("%s %s made %d saves with an average of %.1f saves per game", getFirstName(), getLastName(), getSaves(), calcSaves(games, savesMade));
	}
	
} //End of Goalie
