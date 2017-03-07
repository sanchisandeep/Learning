//max number in array

import java.util.*;

class maxarray
{
	static void max(int b[])
	{  
		int max=b[0];  
		for(int i=1;i<b.length;i++)  
		if(max<b[i])  
		max=b[i];  
  
		System.out.println(max);  
	}  
  
	public static void main(String args[])
	{  
  
		int a[]={33,3,4,5};  
		max(a); 
  
	}	
}  