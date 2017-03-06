import java.util.Scanner;
class EvenOdd
{
	public static void main(String args[])
	{
		int x ;
		System.out.println("enter the number");
		Scanner in=new Scanner(System.in);
		x=in.nextInt();
		if(x % 2 == 0)
		{
			System.out.println("given number is even");
		}
		else
		{
			System.out.println("given number is odd");
		}
	}
}