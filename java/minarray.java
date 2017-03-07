//min of array values

import java.util.*;

class minarray
{
	static void min(int b[])
	{
		int min=b[0];
		for(int i=0;i<b.length;i++)
			if(min>b[i])
				min=b[i];
			System.out.println(min);
	}
	public static void main(String args[])
	{
		int a[]={33,3,4,5};
		min(a);
	}
}
		
			