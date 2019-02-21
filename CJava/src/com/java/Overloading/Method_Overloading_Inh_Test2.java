package com.java.Overloading;
class A_Inh_Test2
{
	void m1(int a)
	{
		System.out.println("A-int-args");
	}
}
class B_Inh_Test2 extends A_Inh_Test2
{
	void m1(float f)
	{
		System.out.println("B-Float-Args");
	}
}
public class Method_Overloading_Inh_Test2 {
	public static void main(String args[])
	{
		B_Inh_Test2 bt= new B_Inh_Test2();
		bt.m1(20);
		bt.m1('a');
		bt.m1(40L);
		
		System.out.println();
		A_Inh_Test2 at=new B_Inh_Test2();
		at.m1(50);
		at.m1('a');
		//at.m1(35.3L);
		
	}

}
