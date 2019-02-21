package com.java.polymorphism;
class A12
{
	static void m1()
	{
		System.out.println(" A m1");
	}
	void m2()
	{
		System.out.println(" A m2");
	}
	void m3()
	{
		System.out.println(" A m3");
	}
	int m3(String s)
	{
		System.out.println(" A m3 String param");
	    return 50;
	}
	}

class B_12 extends A12
{
	static void m1()
	{
		System.out.println("B m1 ");
	}
	void m2()
	{
		System.out.println(" B m2");
	}
	void m3(float f, int x)
	{
		System.out.println(" B m3 float ,int parameter");
	}
}
public class TestAB12 {
	public static void main(String args[])
	{
		B_12 b= new B_12();
		b.m1();
		b.m2();
		b.m3();
		b.m3("abc");
		//b.m3(53.4,43);
		b.m3(53.4f,43);
		System.out.println("----------");
		A12 a= new A12();
		a.m1();
		a.m2();
		a.m3();
		a.m3("abc");
		//a.m3(53.4,43);
		//a.m3(53.4f,43);
	}

}
