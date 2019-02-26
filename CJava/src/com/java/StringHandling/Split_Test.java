package com.java.StringHandling;

import java.util.Arrays;

public class Split_Test {
	public static void main(String[] args) {
		String s1="Sagar Sable";
		System.out.println(s1);
		String[] sa1=s1.split(" ");
		System.out.println(sa1);
		System.out.println(sa1.length);
		System.out.println(Arrays.toString(sa1));
		System.out.println();
		
		String[]sa2=s1.split("a");
		System.out.println(sa2.length);
		System.out.println(Arrays.toString(sa2));
		System.out.println();
		
		String[] sa3=s1.split("b");
		System.out.println(sa3.length);
		System.out.println(Arrays.toString(sa3));
		System.out.println();
		
		
	}

}
