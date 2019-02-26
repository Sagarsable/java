package com.java.StringHandling;

import java.util.Scanner;

public class FindLenght {
	public static void main(String[] args) {
		String s1= "";
		String s2=" ";
		String s3="ab";
		
		String s4= new String();
		String s5= new String ("");
		String s6=new String(" ");
		String s7= new String("ab");
		System.out.println("s1 Lenght::"+s1.length());
		System.out.println("s2 lenght::"+s2.length());
		System.out.println("s3 lenght::"+s3.length());
		System.out.println("s4 lenght::"+s4.length());
		System.out.println("s5 lenght::"+s5.length());
		System.out.println("s6 lenght::"+s6.length());
		System.out.println("s7 lenght::"+s7.length());
		
		System.out.println();
		System.out.println();
		
		String s8=null;
		//System.out.println("s8 lengh::"+s8.length()); java.lang.NullPointerException
		
		String s9;
		//System.out.println("s9 lenght::"+s9.length()); s9 variable not inititalize
		
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter String 1::");
		System.out.println("You Entered "+scn.nextLine().length()+" Character");
		
		
		
		
	}

}
