package com.java.Inheritance;

class A10
{
	int x=10;
	int y=20;
	void m1()
	{
		System.out.println(x);
		System.out.println(y);
	}
}

class B10 extends A10
{
	int x=30;
	int y=40;
	void m2()
	{
		System.out.println(x);
		System.out.println(y);
		
		System.out.println(super.x);
		System.out.println(super.y);
	}
	void m3()
	{
		x=50;
		y=60;
		super.x=70;
		super.y=80;
		
	}
}

public class Test_AB10 {
	public static void main(String args[])
	{
		B10 b= new B10();
		A10 a=b;
		
		B10 b1=new B10();
		A10 a1=b;
		b.m3();
		System.out.println(b.x+" "+b.y);
		System.out.println(a.x+" "+a.y );
		System.out.println("---------------");
		
		System.out.println(b1.x+" "+b.y);
		System.out.println(a1.x+" "+a1.y);
		System.out.println("----------------");
		
		b.m1();b1.m1();
		System.out.println("----------------");
		
		b.m2();b1.m2();
	}

}
