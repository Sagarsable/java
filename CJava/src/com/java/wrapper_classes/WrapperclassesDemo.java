package com.java.wrapper_classes;

public class WrapperclassesDemo {
	public static void main(String arga[])
	{
		//conversion Primitive Data Type to Wrapper Classes
		int i=50;
		
		Integer io1= new Integer(i);
		Integer io2=Integer.valueOf(i);
		System.out.println("i:"+i);
		System.out.println("conversion Primitive Data Type to Wrapper Classes");
		System.out.println("io1:"+io1);
		System.out.println("io2:"+io2);
		/* above program  primitive data type(Integer type)value 
		coverted into Integer wrapper class object */
		
		// conversion wrapper class object type to primitive data type 
		System.out.println("conversion wrapper class object type to primitive data type ");
		int x=io1.intValue();
		System.out.println("x:"+x);
	}

}
