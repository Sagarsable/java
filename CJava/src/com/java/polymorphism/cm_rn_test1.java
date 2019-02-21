package com.java.polymorphism;
class cm
{
	static void m1()
	{
		System.out.println("cm m1");
	}
	void m2()
	{
		System.out.println("cm m2");
	}
	void m3()
	{
		System.out.println("cm m3");
	}
	void m4()
	{
		System.out.println(" cm m4");
	}
	
}
class rn extends cm
{
	static void m1()
	{
		System.out.println("rn m1");
	}
	void m2()
	{
		System.out.println("rn m2");
	}
	void m4(String s)
	{
		System.out.println("rn m3 int param");
	}
}
public class cm_rn_test1 {
	public static void main(String args[])
	{
		rn r=new rn();
		r.m1();
		r.m2();
		r.m3();
		r.m4();
		r.m4("sa");
		cm c= new rn();
		c.m1();
		c.m2();
		c.m3();
		//c.m4("sagar");
	}

}
