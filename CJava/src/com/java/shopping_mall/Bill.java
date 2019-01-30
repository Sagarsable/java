package com.java.shopping_mall;

public class Bill {
	static void m1(Consumer c) {
		double totalamt=c.shirtp+c.pantp+c.tshirtp+c.tracpantp;
		System.out.println("Name of Consumer:"+c.name);
		System.out.println("Amount total:"+totalamt);
		
		if(totalamt>10000) { 
			System.out.println("25% Discount On Your Bill");
		double	dis=(.25*totalamt);
		
		System.out.println("Discount is:"+dis);
		double payamt=totalamt-dis;
		System.out.println("Amount to Pay:"+payamt);
		System.out.println("-------------------------------------");
		}
		
		else {System.out.println("Amount to Pay:"+totalamt);
		System.out.println("--------------------------------------");}
		}
	

}
