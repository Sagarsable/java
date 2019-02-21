package com.java.polymorphism;
class Ambgs_Test
{
	void m1(int i,float f)
	{
		System.out.println("int , float method");
	}
	void m1(float f, int i)
	{
		System.out.println("float , int method");
	}
}
public class Ambgs_error1{
	public static void main(String args[])
	{
		Ambgs_Test at=new Ambgs_Test();
		at.m1(10,20.2f);
		at.m1(20.3f, 20);
		//at.m1(10,20); ambigues error found
		
		
	}

}
