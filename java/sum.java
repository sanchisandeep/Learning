import java.util.*;
class sum
{
	public static void main(String args[])
	{
		int i,j;
		int sum=0;
		for(i=1;i<=10;i++)
		{
			for(j=1;j<=i;j++)
			{
				sum=sum+j;
			}
			System.out.println(sum);
			sum=0;
		}
	}
}