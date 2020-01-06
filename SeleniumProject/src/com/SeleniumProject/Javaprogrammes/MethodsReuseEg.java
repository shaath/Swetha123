package com.SeleniumProject.Javaprogrammes;

public class MethodsReuseEg {

	public static void main(String[] args) 
	{
		MethodsEg me=new MethodsEg();
		me.Function3();

		int res=me.Sum(60,4000,50);
		System.out.println(res);
		
		res=me.Sum(40, 60);
		System.out.println(res);
	}

}
