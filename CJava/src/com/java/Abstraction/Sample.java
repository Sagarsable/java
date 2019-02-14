package com.java.Abstraction;

class Sample extends Example{

	static int b=30;
	int y=40;
	static
	{
		System.out.println("Sample static block");
	}
	{
		System.out.println("Sample non static block");
	}
	Sample()
	{
		System.out.println("Sample Constructor");
	}
	static void m4()
	{
		System.out.println("Sample static method");
	}
	void m5()
	{
		System.out.println("Sample non static block");	
	}
	void m1()
	{
		System.out.println("m1 in sample");
	}
	public static void main(String args[])
	{
		System.out.println("     sample main ");
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		m2();
		m4();
		System.out.println();
		Sample s=new Sample();
		s.m1();
		s.m3();
		s.m5();
	
	}

}

