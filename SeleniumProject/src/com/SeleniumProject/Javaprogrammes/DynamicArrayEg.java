package com.SeleniumProject.Javaprogrammes;

public class DynamicArrayEg {

	public static void main(String[] args)
	{
		String[] name=new String[5];
		
		System.out.println(name.length);
		
//		System.out.println(name[2]);
		
		name[2]="Swetha";
		name[4]="Selenium";
		name[2]="Manual";
		
//		System.out.println(name[2]);
		for (int i = 0; i < name.length; i++)
		{
			System.out.println(name[i]);
		}
	}

}
