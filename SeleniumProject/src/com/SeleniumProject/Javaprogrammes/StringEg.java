package com.SeleniumProject.Javaprogrammes;

public class StringEg {

	public static void main(String[] args) 
	{
		String course="seleniume";
		String string2="You are selected selenium";
		
		int len=course.length();
		System.out.println(len);
		
		String x=course.trim();
		System.out.println(x.length());
		
		
		System.out.println(course.charAt(4));
		
		System.out.println(course.indexOf('e'));
		
		System.out.println(course.substring(2,5 ));
		
		System.out.println(course.toUpperCase());
		
		System.out.println(course.toLowerCase());
		
		
		if(course.equalsIgnoreCase(string2))
		{
			System.out.println("Both the strings are same");
		}
		else
		{
			System.out.println("Both the strings are not same");
		}
		
		if (string2.contains(course))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
		System.out.println("You are selected "+course);
		
		System.out.println(course.join("Random", "I","am","Swetha"));
		
		System.out.println(course.indexOf('e'));
		
		System.out.println(course.lastIndexOf('e'));
	}

}
