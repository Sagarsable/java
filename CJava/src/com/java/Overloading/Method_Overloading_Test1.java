package com.java.Overloading;
class A11{
	static void m1()
	{
		System.out.println("A m1");
	}
	void m2()
	{
		System.out.println("A m2");
	}
	static void m3()
	{
		System.out.println("A m3 no param");
	}
	int m3(String s) 
	{
		System.out.println("A m3 String-parameter");
		return 50;
	}
}
class B12 extends A11{
	static void m1()
	{
		System.out.println("B m1");
	}
	void m2()
	{
		System.out.println("B m2");
	}
	void m3(float f,int x) 
	{
		System.out.println("B m3 float,int param");
		
	}
}
public class Method_Overloading_Test1{
	public static void main(String args[])
	{
		B12 b=new B12();
		b.m1();
		b.m2();
		b.m3();
		b.m3("abc");
		//b.m3(54.3,65);
		b.m3(54.3f,54);
		
		A11 a=new B12();
		a.m1();
		a.m2();
		a.m3();
		a.m3("abc");
		//a.m3(43.5f,87);
	}

}
