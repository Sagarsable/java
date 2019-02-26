package com.java.StringHandling;

public class toString_Test {
	public static void main(String[] args) {
		String s1= "sagar";
		System.out.println("s1:"+s1);
		System.out.println("s1:"+s1.toString());
		System.out.println();
		
		String s2 = new String("Naresh It");
		System.out.println("s2"+s2);
		System.out.println("s2"+s2.toString());
		System.out.println();
		
		String s3= null;
		System.out.println("s3"+s3);
		//System.out.println("s3"+s3.toString());  null pointer exception
		System.out.println();
		
		String s4;
		//System.out.println("s4"+s4);  s4 may not have been initialized
		//System.out.println("s4"+s4.toString());  s4 may not have been initialized
		
		
		
		
	}

}
