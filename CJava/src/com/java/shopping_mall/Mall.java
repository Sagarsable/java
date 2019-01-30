package com.java.shopping_mall;

public class Mall {
	public static void main(String[]args) {
	Chart.msg();
	Consumer c1= new Consumer();
	Consumer c2= new Consumer();
	Consumer c3= new Consumer();
	Consumer c4= new Consumer();
	Consumer c5= new Consumer();
	
	c1.name="Amol";
	c1.shirtp=3000*2;
	c1.pantp=2000*2;
	c1.tshirtp=1000*1;
	c1.tracpantp=1000*1;
	
	c2.name="Sagar";
	c2.shirtp=3000*3;
	c2.pantp=2000*2;
	c2.tshirtp=1000*3;
	c2.tracpantp=1000*1;
	
	
	c3.name="Akash";
	c3.shirtp=3000*1;
	c3.pantp=2000*1;
	c3.tshirtp=1000*1;
	c3.tracpantp=1000*1;
	
	
	c4.name="Vishal";
	c4.shirtp=3000*4;
	c4.pantp=2000*3;
	c4.tshirtp=1000*3;
	c1.tracpantp=1000*2;
	
	
	c5.name="Ram";
	c5.shirtp=3000*2;
	c5.pantp=2000*0;
	c5.tshirtp=1000*1;
	c5.tracpantp=1000*0;
	
	Bill.m1(c1);
	Bill.m1(c2);
	Bill.m1(c3);
	Bill.m1(c4);
	Bill.m1(c5); 
	
	}
}
