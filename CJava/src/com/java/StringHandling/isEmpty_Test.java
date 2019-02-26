package com.java.StringHandling;

import java.util.Scanner;

public class isEmpty_Test {
	public static void main(String[] args) {
		String s1= "";
		String s2=" ";
		String s3="a";
		
		String s4= new String();
		String s5= new String ("");
		String s6=new String(" ");
		String s7= new String("a");
		System.out.println("is s1 Empty:"+s1.isEmpty());
		System.out.println("is s2 Empty:"+s2.isEmpty());
		System.out.println("is s3 Empty:"+s3.isEmpty());
		System.out.println();
		System.out.println("is s4 Empty:"+s4.isEmpty());
		System.out.println("is s5 Empty:"+s5.isEmpty());
		System.out.println("is s6 Empty:"+s6.isEmpty());
		System.out.println("is s7 Empty:"+s7.isEmpty());
		
		String s8=null;
		//System.out.println("is s8 is Empty:"+s8.isEmpty()); Null Pointer Exception
		
		String s9;
		//System.out.println("is s9 Empty:"+s9.isEmpty()); variable s9 is not initialize
		
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter 1 st String ::");
		System.out.println(scn.nextLine().isEmpty());
		
		
		
		
	}

}
