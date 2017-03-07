//intersection array

import java.util.*;

class intersection
{
	public static void main(String args[])
	{
		int a[]={1,2,3,4,5,};
		int b[]={2,5,6,7,8,3};
		int c[]=new int[a.length+b.length];
		int k;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					c[k]=a[i];
				}
			}
		}
		System.out.println(c[k]);
	}
}
		
		