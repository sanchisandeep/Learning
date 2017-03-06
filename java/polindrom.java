import java.util.*;
class polindrom
{
	public static void main(String args[])
	{
		int r,sum=0,temp;
		int n=545;
		temp=n;
		while(n!=0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(temp==sum)
			System.out.println("given number is polindrom");
		else
			System.out.println("given number is not polindrom");
	}
}
			