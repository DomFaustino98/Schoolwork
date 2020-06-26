//Dominic Faustino
public class Defender extends SoccerPlayer
{
	protected int tackles;
	protected boolean redCard;
	
	public Defender(String mFirstName, String mLastName, int mGames, CustomDate mDate, int mTacklesMade, boolean mRedCard)
	{
		super(mFirstName, mLastName, mGames, mDate);
		tackles = mTacklesMade;
		redCard = mRedCard;
	}
	
	public int getTackles()
	{
		return tackles;
	}
	public void setTackles(int inTackles)
	{
		tackles = inTackles;
	}
	
	public boolean getRedCard()
	{
		return redCard;
	}
	public void setRedCard(boolean inRedCard)
	{
		redCard = inRedCard;
	}
	
	public String calcRedCard(int inRedCard)
	{
		if (redCard == true)
		{
			return "and he has a red card.";
		}
		else
		{
			return "and he has no red cards.";
		}

	}
	
	
	@Override
	public String toString()
	{
		return String.format("%s %s made %d tackles %s", getFirstName(), getLastName(), getTackles(), calcRedCard(tackles));
	}
} //End of Defender
