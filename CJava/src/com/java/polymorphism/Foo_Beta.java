package com.java.polymorphism;
interface Foo{ }
public class Foo_Beta { }
class F_A
{
	void m1(Object obj)
	{
		System.out.println("Obect parameter");
	}
	void m1 (Foo f)
	{
		System.out.println("Foo Parameter");		
	}
	public static void main(String args[])
	{
		F_A a= new F_A();
		a.m1(new Foo_Beta());
		
		
	}
}