package com.java.StringHandling;

public class String_Creating_Possible_Way {
	public static void main(String[] args) {
		String s1=new String();
		System.out.println(s1);
		
		String s2="abc";
		// copy String 
		String s3= new String(s2);
		// creating string with direct string literal
		String s4= new String("bbc");
		String s5=s4;
		System.out.println("s2:"+s2);
		System.out.println("S3:"+s3);
		System.out.println("S4:"+s4);
		System.out.println("S5:"+s5);
		System.out.println(s2==s3);
		System.out.println(s4==s5);
		
	}

}
