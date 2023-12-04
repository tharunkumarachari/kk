package decision_making;

public class switch_statement
{
	public static void main(String args[])
	{
		String day="sunday";
		switch(day)
		{
		case "sunday":
			{
			System.out.println("It's "+day+",it is holiday today");
			}
		break;	
		case "monday":
			{
			System.out.println("u have no holiday on "+day);
			}
		break;
		case "friday":
			{
			System.out.println("Hurray..!! its "+day+",last working day of week");
			}
		break;	
		case "saturday":
		{
		System.out.println("Today is "+day+".It's weekend,E njoy a lot");
		}
		break;
		default :
		{
			System.out.println("today("+day+") is a working day");
		}
		}
	}
}
