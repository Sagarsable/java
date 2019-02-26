package com.java.StringHandling;

public class valueOf_Test {
	public static void main(String[] args) {
		System.out.println(String.valueOf(10));
		System.out.println(String.valueOf(10.2));
		System.out.println(String.valueOf('a'));
		System.out.println(true);
		System.out.println();
		System.out.println(String.valueOf("abc"));
		System.out.println(String.valueOf(new char[] {'a','b'}));
		//System.out.println(String.valueOf(null)); null pointer Exception
		System.out.println(String.valueOf((String)null));
	}
}
