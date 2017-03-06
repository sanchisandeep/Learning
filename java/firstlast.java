import java.util.*;
class firstlast
{
	public static void main(String args[])
	{
		String phone="iphone";
		char first=phone.charAt(0);
		char last=phone.charAt(phone.length()-1);
		System.out.printf("first character of string \"%s\" is '%c' %n", phone, first);
		System.out.printf("last character of string \"%s\" is '%c' %n", phone, last); 
	}
}