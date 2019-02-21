package com.java.polymorphism;
class A16
{
	void m1()
	{
		System.out.println("A m1");
	}
	void m2()
	{
		System.out.println("A m2");
		m1();	
	}
}
class B16 extends A16
{
	void m1()
	{
		System.out.println("B m1");
	}
	void m3()
	{
		System.out.println("B m3");
		m1();
		super.m2();
	}
}
class C16 extends B16
{
	void m2()
	{
		System.out.println("C16 m2");
	}
}
public class  Method_Overriding_test16 extends B16
{
	void m1()
	{
		System.out.println("D17 m1");
	}
	void m2()
	{
		System.out.println("D17 m2");		
	}
	void m4()
	{
		System.out.println("D17 m4");
	}
	public static void main(String args[])
	{
		 Method_Overriding_test16 dm= new Method_Overriding_test16();
		dm.m1();
		dm.m2();
		dm.m3();
		dm.m4();
	}
}
