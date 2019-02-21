package com.java.Overloading;
class Example_Test1
{
	void add(int a, int b)
	{
		System.out.println("Example int , int");
	}
	void add(String a,float b)
	{
		System.out.println("Example String , float");
	}
	int add(String s1, String s2)
	{
		System.out.println("Example String , String");
		return 10;
	}
}
class Sample_Test1 extends Example_Test1
{
	void add(int x,int y)
	{
		System.out.println("Sample int,int");
	}
	float add(float a, int b)
	{
		System.out.println("Sample float , int");
	    return a+b;
	}
	String add(String s1,double d)
	{
		System.out.println("Sample string , double");
		return s1+d;
	}
	
}
public class Overloading_with_Inh_Test1{
	public static void main (String args[])
	{
		Sample_Test1 st = new Sample_Test1();
		st.add(10,20);
		st.add("sagar",20);
		st.add("sagar","sable");
		st.add("10",20.0);
		//st.add(10,1.8f);	
	}
}
