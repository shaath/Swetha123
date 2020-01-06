package com.SeleniumProject.Javaprogrammes;

public class SwitchCaseEg {

	public static void main(String[] args) 
	{
		String Course="Selenium";
		
		switch(Course)
		{
		case "Manual":
			System.out.println("You are selected manual");
			break;
		case "selenium":
			System.out.println("You are selected selenium");
			break;
		case "UFT":
			System.out.println("You are seelected UFT");
			break;
		default:
			System.out.println("Select a proper course");
			break;
		}

	}

}
