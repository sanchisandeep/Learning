//sum of array values

import java.util.*;

class sumarray
{
	public static void main(String args[])
	{
		int a[]={1,5,3,6,8,7};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("sum of numbers is:" +sum);
	}
}
			