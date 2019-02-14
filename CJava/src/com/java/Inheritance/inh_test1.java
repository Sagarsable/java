package com.java.Inheritance;
class A
{
	static int a=10;
	int x=20;
	static void m1()
	{
		System.out.println("A class m1");
	}
	void m2()
	{
		System.out.println("A class m2");
	}
	void m3()
	{
		System.out.println("A class m3");
	}
}
public class inh_test1 extends A 
{
	static int a=50;
	int x=60;
	static void m1()
	{
		System.out.println("B class m1");
	}
	void m2()
	{
		System.out.println("B class m2");
	}
	public static void main(String args[])
	{
		System.out.println("a:"+a);
		m1();
		 inh_test1 b =new inh_test1();
		 System.out.println("x;"+b.x);
		 b.m2();
		 b.m3();
		
	}

}
