package com.java.polymorphism;


public class Method_Overloading_Test4 {
	static void m1(byte b)
	{
		System.out.println("byte-args");
	}
	public static void main(String args[])
	{
		//m1(30); use casting 
		m1((byte)40);
		byte b=43;
		m1(b);
	}

}
