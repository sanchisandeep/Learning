//odd number array 

import java.util.*;
class oddarray
{
	public static void main(String args[])
	{
		int a[]={2,3,4,5,6,7,8};
		for(int i=0;i<a.length;i++)
		{
			if(a[i] % 2 != 0)
			{
				System.out.println(a[i]+ " ");
			}
		}
	}
}