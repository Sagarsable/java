package com.java.Inheritance;
class A8
{
	static int a=10;
	int x=20;
	
}
class B8 extends A8
{
	static int a=30;
	int x=40;
}

public class Test_AB_1 {

	public static void main(String args [])
	{
		B8 b= new B8();
		A8 a = new B8();
		System.out.println(b.a+"....."+b.x);// 30.......40
		System.out.println(a.a+"....."+a.x);//10.......20
		System.out.println(B8.a+"...."+A8.a);//30......10
		
		b.a=5;
		a.a=6;
		System.out.println(b.a+"....."+b.x);//5.....40
		System.out.println(a.a+"....."+a.x);//6.....20
		System.out.println(B8.a+"...."+A8.a);//5....6
		
	}
}
