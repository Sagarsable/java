package com.java.Overloading;
class A_Inh_Test3
{
	void m1(float f)
	{
		System.out.println("A float args");
	}
}
class B_Inh_Test3 extends A_Inh_Test3
{
	void m1(int a)
	{
		System.out.println("B int args");
	}
}
public class Method_Overloading_Inh_Test3 {
	public static void main(String args[])
	{
		B_Inh_Test3 bt= new B_Inh_Test3();
		bt.m1(50);
		bt.m1('a');
		bt.m1(40L);
		System.out.println();
		A_Inh_Test3 at= new A_Inh_Test3();
		at.m1(50);
		at.m1('a');
		at.m1(45L);
		
		
	}

}
