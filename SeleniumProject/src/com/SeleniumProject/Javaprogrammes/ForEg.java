package com.SeleniumProject.Javaprogrammes;

public class ForEg {

	public static void main(String[] args)
	{
		
		//initialization; Condition; incrementor		i=i+1
//		for(int i=1; i <= 10; i++ )
//		{
//			System.out.println("Hi");
//		}
		
		for(int i=1; i <= 100; i++ )
		{
			System.out.println(i);
			if(i == 75)
			{
				break;
			}
		}
		System.out.println("*****************");
		
		for(int i=100; i >= 1; i--)
		{
			System.out.println(i);
		}
	}

}
