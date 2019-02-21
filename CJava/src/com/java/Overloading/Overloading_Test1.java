package com.java.Overloading;

public class Overloading_Test1 {
	void add()
	{
		System.out.println("No-args-add");
	}
	void add(int a)
	{
		System.out.println("int-args-add");
	}
	void add(String str)
	{
		System.out.println("String-args-add");
	}
	/*int add(String s)
	{
		System.out.println("String-args-add");
	}*/
	public static void main(String args[])
	{
		Overloading_Test1 o= new Overloading_Test1();
		o.add();
		o.add(10);
		o.add("sagar");
	}
}
