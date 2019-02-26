package com.java.StringHandling;

public class String_Copy{
	public static void main(String[] args) {
		char[] ch= {'a','b','c','e','f'};
		String s1=new String(ch);
		System.out.println(s1);
		
		String s2=new String(ch,2,3);
		System.out.println(s2);
		
		byte[] b= {97,98,99,100,101,102};
		String s8= new String(b);
		System.out.println(s8);
		String s9= new String(b,2,2);
		System.out.println(s9);
		
	}
}
