package com.java.Overloading;

public class Method_Overloading_Test3 {
	static void m1(int a)
	{
		System.out.println("int args");
	}
	static void m1(float f)
	{
		System.out.println("Float args");
	}
	public static void main(String args[])
	{
		m1(10);
		m1('a');
		m1(12L);
		long l=30;
		m1(l);
		//m1(20.3); use casting 
		
		
		
	}

}
