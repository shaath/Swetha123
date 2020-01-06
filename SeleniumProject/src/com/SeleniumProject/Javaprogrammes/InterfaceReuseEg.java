package com.SeleniumProject.Javaprogrammes;

public class InterfaceReuseEg {

	public static void main(String[] args) 
	{
//		InterfaceImplementsEg1 ii=new InterfaceImplementsEg1();
		InterfaceEg im1=new InterfaceImplementsEg1();
		im1.vehicle();
		im1.ship();
		im1.Car();
		im1.Bike();
		
		InterfaceEg im2=new InterfaceimplementsEg2();
		im2.vehicle();
		im2.Car();
		im2.ship();
		im2.Bike();

	}

}
