package com.java.StringHandling;

public class CompareTo_Test {
	public static void main(String[] args) {
		String s1="a";
		String s2="a";
		String s3="A";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.compareTo(s2));
		System.out.println();
		
		System.out.println(s1.equals(s3));
		System.out.println(s1.compareTo(s3));
		System.out.println();
		System.out.println(s3.equals(s1));
		System.out.println(s3.compareTo(s1));
		System.out.println();
		
		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println(s1.compareToIgnoreCase(s3));
		
		
	}

}
