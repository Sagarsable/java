package com.java.polymorphism;
class Super_example
{
	void m1()
	{
		System.out.println("Example m1");
	}
	void m2()
	{
		System.out.println("Example m2");
	}
	void m3()
	{
		System.out.println("Example m3");
	}
	
}
public class Super_overridden extends Super_example{
	void m1()
	{
		System.out.println("Super_overridden m1");
	}
	void m2()
	{
		super.m2();
		System.out.println("Super_overridden m2");
	}
	public static void main(String args [])
	{
		Super_overridden so=new Super_overridden();
		so.m1();
		so.m2();
		so.m3();
		
	}

}
