package com.SeleniumProject.Javaprogrammes;

public class NestedIf {

	public static void main(String[] args) 
	{
		int a=200;
		int b=200;
		int c=2000;
		
		if(a > b & a > c)
		{
			System.out.println("A is greater");
		}
		else if(b > c & b > a)
		{
			System.out.println("B is greater");
		}
		else if(c > a & c > b)
		{
			System.out.println("C is greater");
		}
		else
		{
			System.out.println("Assign unique values to the variables");
		}
		
		
	}

}
