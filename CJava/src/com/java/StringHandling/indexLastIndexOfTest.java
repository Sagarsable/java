package com.java.StringHandling;

public class indexLastIndexOfTest {
	public static void main(String[] args) {
		String s="Java Programming Language";
		System.out.println(s.length());
		System.out.println(s.indexOf('a'));
		System.out.println("if index not available return -1:");
		System.out.println(s.indexOf('A'));
		System.out.println(s.lastIndexOf('A'));
		System.out.println();
		System.out.println(s.indexOf("Program"));
		System.out.println(s.lastIndexOf("Program"));
		System.out.println();
		System.out.println();
		
		String s2="javaHariKrishna";
		System.out.println(s2.indexOf("hari"));
		
		String s3=s2.toLowerCase();
		System.out.println(s3);
		System.out.println(s3.indexOf("hari"));
		System.out.println(s2);
		
		
	}

}
