package com.SeleniumProject.Javaprogrammes;

public class DoWhileEg {

	public static void main(String[] args) 
	{
		int i=1;
		do
		{
			System.out.println(i);
			i++;
			if(i==45)
			{
				break;
			}
		}
		while(i <= 100);
		
		
		int j=100;
		do
		{
			System.out.println(j);
			j--;
		}
		while(j >= 1);

	}

}
