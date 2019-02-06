package Oop_mini_proj;

import java.util.Scanner;
class bike2
{
	private int gear;
    public	void setgear(int gear)
	{
	 if (gear<0 || gear>5)
	   {
	     throw new IllegalArgumentException("Enter gear in between 0 To 5");
	   }
	else 
	   {
		this.gear=gear;
	   }
	}
	public int getgear()
	{
		return gear;
	}
	public void currentgear()
	{
	  if(gear==0)
	    System.out.println("Bike is neutral");
	  else
			System.out.print("Bike running in "+gear);
		    System.out.println(" gear");
    }
}
public class Bikerider1
{
  public static void main(String args[])
   {
	 Scanner scn=new Scanner(System.in);
	 bike2 pulsar= new bike2();
 while(true)
   {
    System.out.println("Enter gear:");
    pulsar.setgear(scn.nextInt());
	pulsar.getgear();
	pulsar.currentgear();
   }
  }  
 // catch(IllegalArgumentException e)
   {
 	System.out.println("e.Message()");
   }
 }

