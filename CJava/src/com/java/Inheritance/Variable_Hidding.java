package com.java.Inheritance;

// hidding subclass variable in superclass 
class A3
{
	int x=10;
	int y=20;
	void m1()
	{
		System.out.println("m1()");
	}
	
}
public class Variable_Hidding extends A3 {
	int x=30;
	int y=40;
	void m2()
	{
		System.out.println("x:"+x);
		System.out.println("y:"+y);
		
		System.out.println("x:"+super.x);
		System.out.println("y:"+super.y);
		
	}
	void m3()
	{
		int x=50;
		int y=60;
		System.out.println("Local:"+x);
		System.out.println("Local:"+y);
		
		System.out.println("subclass:"+this.x);
		System.out.println("subclass:"+this.y);
		
		System.out.println("super:"+super.x);
		System.out.println("super:"+super.y);
		
	}
	public static  void main(String args[])
	{
		Variable_Hidding vh=new Variable_Hidding();
		vh.m1();
		vh.m2();
		vh.m3();
	}
}
