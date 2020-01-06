package com.SeleniumProject.Javaprogrammes;

public class WhileEg {

	public static void main(String[] args)
	{
		int i=1;
		while(i <= 100)
		{
			System.out.println(i);
			
			i++;
			if(i > 65)
			{
				break;
			}
		}
		
		int j=100;
		while(j >= 1)
		{
			System.out.println(j);
			j--;
		}

	}

}
