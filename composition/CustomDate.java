//Dominic Faustino
//CE-Composition
public class CustomDate 
{
	private int monthI;
	private int day;
	private int year;
	private String monthS;

	CustomDate()
	{
		monthI = 0;
		day = 0;
		year = 0;
		monthS = "None";
	}

	CustomDate(int mMonthI, int mDay, int mYear)
	{
		if (mMonthI < 0 || mDay < 0 || mYear < 0)
		{
			throw new IllegalArgumentException();
		}
		monthI = mMonthI;
		day = mDay;
		year = mYear;
	
		switch(monthI)
		{
		case 1: 
			monthS = "January";
			break;
		case 2: 
			monthS = "February";
			break;
		case 3: 
			monthS = "March";
			break;
		case 4: 
			monthS = "April";
			break;
		case 5: 
			monthS = "May";
			break;
		case 6: 
			monthS = "June";
			break;
		case 7: 
			monthS = "July";
			break;
		case 8: 
			monthS = "August";
			break;
		case 9: 
			monthS = "September";
			break;
		case 10: 
			monthS = "October";
			break;
		case 11: 
			monthS = "November";
			break;
		case 12: 
			monthS = "December";
			break;
		}
	}
	
	public String toString()
	{
		return monthS + " " + day + ", " + year;
	}

} //End of CustomDate