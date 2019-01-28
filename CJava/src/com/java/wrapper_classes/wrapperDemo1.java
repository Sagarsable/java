package com.java.wrapper_classes;

public class wrapperDemo1 
{
	public static void main(String args[])
	{
	// PDT ==>WCO Conversion
		
     // Byte b1=new Byte(50); CE --> The constructor Byte(int) is undefined
		Byte b2=new Byte((byte)50);//50
		 
		Float f1=new Float(50);    //50.0
		Float f2=new Float(32.3f); //  32.3 --> Float(float)
		Float f3=new Float(32.4);  //32.4 --> Double(Float)
		 
		
		  Character ch1=new Character('a');// a
		//Character ch2=new Character(97); CE--> The constructor Character(int)is indefined
		  Character ch3=new Character((char)97);// a
		  Double d1=new Double(67.43); // 67.43
		  Double d2=new Double(98);   // 98.0
		  Double d3=new Double('a'); //97.0
		  
	// WCO ===>PDT Conversion
		  Integer io3=Integer.valueOf(255);
		//char ch11=io3.charvalue();//casting required
	    //char ch12=io3.intValue();//casting required
		char ch13=(char)io3.intValue();// y 
        
		//boolean bo1=io3.booleanValue();incompatible type
		//boolean bo3=io3.intValue();incompatible type
		//boolean bo3=(boolean)io3.intValue(); incompatible type
	}
}
