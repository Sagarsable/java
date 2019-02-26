package com.java.StringHandling;

public class trim_Test {
	public static void main(String[] args) {
		String s1=" abc bbc  ";
		System.out.println(s1.length());
		System.out.println(s1);
		
		s1.trim();
		System.out.println(s1.length());
		System.out.println(s1);
		
		String s2=s1.trim();
		System.out.println(s2.length());
		System.out.println(s2);
		
	}

}
