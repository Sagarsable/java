package com.java.StringHandling;

public class StringBuffer_Append {
	public static void main(String[] args) {
		StringBuffer sb1= new StringBuffer();
		System.out.println("SB1 capacity::"+sb1.capacity());
		System.out.println("SB1 lenght::"+sb1.length());
		System.out.println("SB1::"+sb1);
		System.out.println();
		
		sb1.append("a");
		System.out.println("SB1 capacity::"+sb1.capacity());
		System.out.println("SB1 lenght::"+sb1.length());
		System.out.println("SB1::"+sb1);
		System.out.println();
		
		sb1.append(10);
		System.out.println("SB1 capacity::"+sb1.capacity());
		System.out.println("SB1 lenght::"+sb1.length());
		System.out.println("SB1::"+sb1);
		sb1.append("Sagar");
		System.out.println("SB1 capacity::"+sb1.capacity());
		System.out.println("SB1 lenght::"+sb1.length());
		System.out.println("SB1::"+sb1);
		System.out.println();
		
		
		
	}

}
