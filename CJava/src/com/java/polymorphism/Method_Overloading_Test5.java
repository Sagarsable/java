package com.java.polymorphism;

class MOL5_1
{
	void m1(int i)
	{
		System.out.println("int args");
	}
	void m1(byte b)
	{
		System.out.println("byte args");
	}
}

public class Method_Overloading_Test5 {
	public static void main(String args[])
	{
		byte b=10;
		short s=15;
		char ch='a';
		int i=20;
		
		MOL5_1 obj=new MOL5_1();
		obj.m1(b);
		obj.m1(s);
		obj.m1(ch);
		obj.m1(i);
		obj.m1(10);
		obj.m1(15);
		obj.m1('a');
		obj.m1(20);
		obj.m1((byte)10);
		
	}
	

}
