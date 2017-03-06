import java.util.*;
class prime
{
	public static void main(String args[])
	{
		int i, m=0;
		int n=4;
		m=n/2;
		for(i=2;i<=m;i++)
		{
			if(n%2==0)
				System.out.println("number is not prime");
			else
				System.out.println("number is prime");
			break;
		}
	}
}
		
		
	