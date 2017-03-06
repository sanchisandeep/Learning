import java.util.*;
class grade
{
	public static void main(String args[])
	{
		int mark[]=new int[5];
		int i;
		float sum=0,avg;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the marks obtained in 5 subjects:");
		for(i=0;i<5;i++)
		{
			mark[i]=scan.nextInt();
			sum=sum+mark[i];
		}
		avg=sum/5;
		System.out.println("your grade is:");
		if(avg>95)
		{
			System.out.println("grade is A+");
		}
		else if(avg>=90 && avg<=94)
		{
			System.out.println("grade is A");
		}
		else if(avg>85 && avg<=89)
		{
			System.out.println("grade is A-");
		}
		else if(avg>=80 && avg<=84)
		{
			System.out.println("grade is B+");
		}
		else if(avg>=75 && avg<=79)
		{
			System.out.println("grade is B");
		}
		else if(avg>=70 && avg<=74)
		{
			System.out.println("grade is B-");
		}
		else if(avg>=65 && avg<=69)
		{
			System.out.println("grade is C+");
		}
		else if(avg>=60 && avg<=64)
		{
			System.out.println("grade is C");
		}
		else if(avg>=55 && avg<=59)
		{
			System.out.println("grade is C-");
		}
		else if(avg>=50 && avg<=54)
		{
			System.out.println("grade is D+");
		}
		else if(avg>=45 && avg<=49)
		{
			System.out.println("grade is D");
		}
		else if(avg>=44 && avg<=40)
		{
			System.out.println("grade is D-)");
		}
		else if(avg>=35 && avg<=39)
		{
			System.out.println("grade is E");
		}
		else
		{
			System.out.println("grade is F");
		}
	}
}