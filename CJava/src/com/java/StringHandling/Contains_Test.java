package com.java.StringHandling;

public class Contains_Test {
	public static void main(String[] args) {
		String s1="JavaHariKrishna";
		System.out.println(s1.contains("Java"));
		//System.out.println(s1.contains('Java')); this method contain only string type
		System.out.println(s1.contains(new StringBuffer("Java")));
	}

}
