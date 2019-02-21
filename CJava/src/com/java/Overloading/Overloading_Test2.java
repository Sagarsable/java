package com.java.Overloading;

public class Overloading_Test2 {
	static int m2()
	{
		return 'a';
	}
	static char m3()
	{
		return 92;
	}
	void m1(int a)
	{
		System.out.println("Int-args");
	}
	void m1(char ch)
	{
		System.out.println("Char-args");
	}
	public static void main(String args [])
	{
		Overloading_Test2 t= new Overloading_Test2();
		t.m1(99);
		t.m1('c');
		t.m1((char)100);
		t.m1((int)'d');
		System.out.println();
		
		int i1=97;
		int i2='a';
		char ch1=98;
		char ch2='b';
		
		t.m1(i1);
		t.m1(i2);
		t.m1(ch1);
		t.m1(ch2);
		System.out.println();
		
		t.m1((char)i1);
		t.m1((int)ch1);
		System.out.println();
		
		t.m1(i1+i2);
		t.m1(ch1+ch2);
		System.out.println();
		
		t.m1(10+'a');
		t.m1('a'+'b');
		t.m1((char)('a'+'b'));
		t.m1((char)'a'+'b');
		
		System.out.println();
		t.m1(m2());
		t.m1(m3());
	}

}
