package com.java.Inheritance;
class A2
{
	static int a=10;
	int x=20;
	static void m1()
	{
		System.out.println(" class A m1()");
		
	}
	void m2()
	{
		System.out.println("class A m2");
	}
	void m3()
	{
		System.out.println("class A m3");
	}
}
class Super_Test1 extends A2
{
	static int b=40;
	int y=50;
	static void m1()
	{
		
     // super.m1(); cannot use super in static context
		System.out.println("class Super_Test1 m1 ");
	}
	void m2()
	{
		System.out.println("class Super_Test1 m2");
		super.m2();
	}
	 void m4()
	{
		
		System.out.println(super.a+"---"+a);
		System.out.println(super.x+"---"+x);
		super.m1();
		m1();
		super.m2();
		m2();
	}
	public static void main(String args[])
	{
		Super_Test1 tst= new Super_Test1();
		tst.m4();
		
	}

}
