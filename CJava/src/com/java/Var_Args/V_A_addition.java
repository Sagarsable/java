package com.java.Var_Args;

public class V_A_addition {
	static void add(int... a)
	{
		System.out.println(a.length+" value array is passed");
		for(int i=0;i<a.length;i++)
		{
	      System.out.println("value "+(i+1)+" is:"+a[i]);
			
		}
	}
	public static void main(String args[])
	{
V_A_addition.add(3,5,6,3,2,1,9);
	}

}
