package com.java.StringHandling;

public class Startwith_Endswith {
	public static void main(String[] args) {
		String s1= "Sagar vilas sable";
		System.out.println(s1.startsWith("S"));
		System.out.println(s1.startsWith("Sagar"));
		System.out.println(s1.endsWith("Sagar"));
		System.out.println(s1.startsWith("vilas"));
		System.out.println(s1.endsWith("sable"));
		System.out.println(s1.startsWith("Sagar vilas sable"));
		System.out.println(s1.endsWith("Sagar vilas sable"));
		
	}

}
