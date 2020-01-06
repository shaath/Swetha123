package com.SeleniumProject.Javaprogrammes;

public class InheritanceEg extends MethodsEg
{

	public static void main(String[] args)
	{
		Function1();
		MethodsEg m=new MethodsEg();
		m.Function3();
		int res=m.Sum(40, 60);
		System.out.println(res);
		
		m.Function1();
		
	}
	public static void Function1()
	{
		System.out.println("This is InheritanceEg class Function1 code");
	}

}
