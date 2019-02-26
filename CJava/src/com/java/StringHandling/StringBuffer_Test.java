package com.java.StringHandling;

public class StringBuffer_Test {
	public static void main(String[] args) {
		StringBuffer sb1= new StringBuffer();
		System.out.println(sb1);
		System.out.println(sb1.capacity());
		System.out.println();
		
		StringBuffer sb2= new StringBuffer(3);
		System.out.println(sb2);
		System.out.println(sb2.capacity());
		System.out.println();
		StringBuffer sb3= new StringBuffer("Sagar");
		System.out.println(sb3);
		System.out.println(sb3.capacity());
		System.out.println();
		
		StringBuffer sb4 = new StringBuffer("abc");
		StringBuffer sb5 = new StringBuffer(sb4);
		System.out.println(sb4);
		System.out.println(sb5);
		System.out.println(sb4.capacity());
		System.out.println(sb5.capacity());
		
		
	}

}
