package com.SeleniumProject.Javaprogrammes;

public class PolyndromeStringEg {

	public static void main(String[] args) 
	{
		String name="Madam";
		int len=name.length();
		
		String rev="";
		
		for (int i = len-1; i >= 0 ; i--)
		{
			rev=rev+name.charAt(i);
		}

		System.out.println(rev);
		
		if (name.equalsIgnoreCase(rev))
		{
			System.out.println("Given string is a polyndrome");
		}
		else
		{
			System.out.println("Given string is not a polyndrome");
		}
	}

}
