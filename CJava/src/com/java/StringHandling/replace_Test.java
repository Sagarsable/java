package com.java.StringHandling;

public class replace_Test {
	public static void main(String[] args) {
		String s1="abc abc abc";
		System.out.println(s1);
		System.out.println();
		
		s1.replace('a','b');
		System.out.println(s1);
		System.out.println();
		
		String s3=s1.replaceFirst("a","b");
		System.out.println(s3);
		System.out.println();
		
		s1=s1.replace('a','b');
		System.out.println(s1);
		System.out.println();

	}

}
