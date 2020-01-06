package com.SeleniumProject.Javaprogrammes;

public class StaticArrayEg {

	public static void main(String[] args) 
	{
		int[] sal={10000,20000,30000,40000,50000,60000,70000,30000}; 
		
		int len=sal.length;
		System.out.println(len);
		
//		System.out.println(sal[5]);
		
//		for(int i=0;i < len;i++)
//		{
//			System.out.println(sal[i]);
//		}

		for (int swetha : sal)
		{
			System.out.println(swetha);
		}
	}

}
