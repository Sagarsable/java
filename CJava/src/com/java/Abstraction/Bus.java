package com.java.Abstraction;

abstract class Bus 
{
	abstract void engine();
	void breaks()
	{
		System.out.println("Breaks applied bus stop");
	}
	void wheels()
	{
		System.out.println("Bus will run on 6 wheels");
	}
}


