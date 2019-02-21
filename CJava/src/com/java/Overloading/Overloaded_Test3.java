package com.java.Overloading;
class Test3
{
	public void foo(Object o)
	{
		System.out.println("Object Parameter");
	}
	public void foo(String s)
	{
		System.out.println("String parameter");
	}
	public void foo(Integer i)
	{
		System.out.println("Integer parameter");
	}
}
public class Overloaded_Test3 {
	public static void main(String args [])
	{
		Test3 t3= new Test3();
		
		Object obj1=new Object();
		Object obj2= "sagar";
		Object obj3= new Integer(2434);
		
		t3.foo(obj1);
		t3.foo(obj2);
		t3.foo(obj3);
		
		System.out.println();
		t3.foo("sagar");
		t3.foo(5433);
		
		System.out.println();
		t3.foo((String)obj2);
		t3.foo((Integer)obj3);
		System.out.println();
		
		//t3.foo((String)obj1);  //Object cannot be cast to java.lang.String
		t3.foo((Integer)obj3);
		//t3.foo((Integer)obj1);//Object cannot be cast to java.lang.String
		t3.foo((Integer)obj3);
		
	
		
	}

}
