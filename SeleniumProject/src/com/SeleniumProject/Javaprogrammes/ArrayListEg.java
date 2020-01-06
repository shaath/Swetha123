package com.SeleniumProject.Javaprogrammes;

import java.util.ArrayList;

public class ArrayListEg {

	public static void main(String[] args) 
	{
		ArrayList<Object> x=new ArrayList<Object>();
		
		//Writing the data into arraylist
		x.add("Selenium");
		x.add(70000);
		x.add('M');
		x.add(true);
		x.add(4444.44);
		x.add(70000);
		x.add(6, "Swetha");
		x.add(9, "Swetha");
		
		
		System.out.println(x.size());
		
		for (int i = 0; i < x.size(); i++)
		{
			System.out.println(x.get(i));
		}

	}

}
