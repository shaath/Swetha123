package com.SeleniumProject.Javaprogrammes;

public class OccurancesEg {

	public static void main(String[] args) 
	{
		String course="Selenieueme";
		
		int counter=0;
		
		int len=course.length();
		System.out.println(len);
		
		for(int i=0; i < len; i++)
		{
			
			if(course.charAt(i)=='e')
			{
				counter++;
			}
			else
			{
				System.out.println(i+"---"+course.charAt(i));
			}
		}
		
		System.out.println(counter);

	}

}
