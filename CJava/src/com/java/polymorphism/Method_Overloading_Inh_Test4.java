package com.java.polymorphism;
class A_Inh_Test4
{
	void m1(int a)
	{
		System.out.println("A Int args ");
	}
}
class B_Inh_Test4 extends A_Inh_Test4
{
	void m1(float f)
	{
		System.out.println("B float args");
	}
	void m1(char ch)
	{
		System.out.println("B char args");
	}
}
public class Method_Overloading_Inh_Test4 {
	public static void main(String args[])
	{
		B_Inh_Test4 bt = new B_Inh_Test4();
		bt.m1(50);
		bt.m1('a');
		bt.m1(50L);
		System.out.println();
		
		A_Inh_Test3 at = new A_Inh_Test3();
		at.m1(30);
		at.m1('a');
		at.m1(40L);
	}

}
