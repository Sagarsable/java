package com.java.StringHandling;
// storing objects in string pool
public class intern_Test {
	public static void main(String[] args) {
		String s1="Hari";
		String s2=s1.intern();
		System.out.println(s1==s2);
		
		String s3= new String("Nit");
		String s4=s3.intern();
		String s5="Nit";
		System.out.println(s3==s4);
		System.out.println();
		
		String s6=s1.trim();
		String s7=s6.intern();
		System.out.println(s6==s7);
		System.out.println();
		
		String s8="HariNIT";
		String s9=s6.concat(s5);
		String s10=s9.intern();
		System.out.println(s8==s10);
		System.out.println(s9==s10);
		
		
		
	}

}
