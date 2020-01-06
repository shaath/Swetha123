package com.SeleniumProject.Javaprogrammes;

public class MethodsEg {

	public static void main(String[] args)
	{
		Function1();
		String res=Function2();
		System.out.println(res);
		
		MethodsEg me=new MethodsEg();
		me.Function3();
		
		boolean flag=me.Function4();
		System.out.println(flag);
		
	}
	
	//static method without returning any value
	public static void Function1()
	{
		System.out.println("This is Functiion1 code");
	}
	//static method Returning value
	public static String Function2()
	{
		System.out.println("This is Function2 code");
		return "Pass";
	}
	
	//Non static method without returning any value
	public void Function3()
	{
		System.out.println("This is Function3 code");
	}
	//Non static method with returning a value
	public boolean Function4()
	{
		System.out.println("This is Function4 code");
		return true;
	}

	public int Sum(int a , int b)
	{
		int c=a+b;
		return c;
	}
	
	public int Sum(int a, int b, int c)
	{
		int d=a+b+c;
		return d;
	}
}
