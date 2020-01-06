package com.SeleniumProject.Javaprogrammes;

public class ObjectEg {

	public static void main(String[] args) 
	{
		Object[] x={10000,222.22,"Selenium",'M',true};
		
		System.out.println(x.length);
		
		for (int i = 0; i < x.length; i++) 
		{
			System.out.println(x[i]);
		}

	}

}
