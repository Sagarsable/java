package com.java.Inheritance;

// how super class static  and non static variable are shared to all its subclass
class A11
{
	static int a=10;
	int x=20;
	static {
		System.out.println("A is Loaded");
		
	}
}
class B11 extends A11
{
	static int b=30;
	int y=40;
	static 
	{
		System.out.println("B is loaded");
	}
}
class C11 extends B11
{
	static int c=50;
	int x=60;
	static 
	{
		System.out.println("C is loaded");
	}
}

public class VariableHidding_Test1 {

	public static void main(String args[])
	{
		B11 b1=new B11();
		C11 c1=new C11();
		
		b1.a=15;
		b1.x=16;
		System.out.println("b1.a  "+b1.a);
		System.out.println("c1.a  "+c1.a);
		
		System.out.println("b1.x  "+b1.x);
		System.out.println("c1.x  "+c1.x);
	
		
	}
	
}
