package loop_statements;

public class nested_loop 
{
	public static void main(String args[])
	{
		int i=10;
		for(int j=1;j<=i;j++)
		{
			System.out.println(j);
			for(int k=1;k== i;k++)
			{
				System.out.println(k);
			}
		}
	}
}
