package com.java.polymorphism;
//imp case with referanced type overloaded method
class Example{}
class Sample extends Example{}
class A{
	void m1(Example e)
	{
		System.out.println("Example args");
	}
	void m1(Sample s)
	{
		System.out.println("Sample args");
	}
	
}
public class Demo2 {
	public static void main(String[] args)
	{
		Example e=new Example();
        Example e1=new Sample();
    	Sample s=new Sample();
    	Example e2=null;
    	Sample s1=null;
    	
		A a1=new A();
		a1.m1(e);// here variable referance type is Example obj
		a1.m1(e1);//here variable referance type is Example obj
		a1.m1(s);//here variable referance type is Sample obj
		a1.m1(e2);//here variable referance type is Example obj
		a1.m1(s1);//here variable referance type is Sample obj
		
	}

}
