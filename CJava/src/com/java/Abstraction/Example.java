package com.java.Abstraction;

abstract class Example {

	abstract void m1();
	static int a=10;
	int x=20;
	static
	{
		System.out.println("Example static block");
	}
	{
		System.out.println("Example non static block");
	}
	Example()
	{
		System.out.println("Example constructor");
	}
	static void m2()
	{
		System.out.println("Example static method");
	}
	void m3()
	{
		System.out.println("Example non static method");
	}
	public static void main(String args[])
	{
		System.out.println("Example main");
		System.out.println("a;"+a);
		m2();
		//Example e=new Example(); instiate 
		//e.m3();
		
		}
}
