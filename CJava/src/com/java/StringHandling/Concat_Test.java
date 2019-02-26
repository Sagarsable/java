package com.java.StringHandling;

public class Concat_Test {
	public static void main(String[] args) {
		String s1="Hari";
		String s2=s1.concat("Krishna");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println();
		
		String s3="a";
		s3.concat("b");
		System.out.println(s3);
		
		String s4=s3.concat("c");
		System.out.println(s4);
		System.out.println(s3==s4);
		
		s3=s3.concat("d");
		System.out.println(s3);
		
		System.out.println(s3.concat("e"));
		System.out.println(s3.concat("f"));
		
		String s5=s3.concat("");
		System.out.println("s3 "+s3);
		System.out.println("s5 "+s5);
		System.out.println(s3==s5);
	}

}
