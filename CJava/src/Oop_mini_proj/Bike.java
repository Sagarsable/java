package Oop_mini_proj;
import java.io.*;
import java.util.*;

public class Bike {
private static String brand;
private static int wheels;
private static int count;
private String engnum;
private String color;
private String ownername;
private String bikenum;
static 
{
	System.out.println("\n class Bike is loaded");
	try 
	{
		Scanner scn=new Scanner(new File("companydetail.txt"));
		brand=scn.nextLine();
		wheels=scn.nextInt();
		System.out.println("Brand is initianlize with"+brand);
		System.out.println("wheels is initialize with"+wheels);
	}
	catch(FileNotFoundException e)
	{
		e.printStackTrace();
	}
}{
count++;
}
public Bike(String engnum,String color)
{
	if(brand==null)
	{
		throw new RuntimeException("companydetail.txt file is not found");
	}
	this.engnum=engnum;
	this.color=color;
	System.out.println("eng num and color properties are initialize");
}
public String getEngnum() 
{
	return this.engnum;
}
public String setcolor()
{
	return this.color;
}
public String getownername()
{
	return this.getownername();
}
public void setownername(String ownername)
{
	this.ownername=ownername;
	System.out.println("ownername properties are initialize");
}
public String getbikenum()
{
	return this.bikenum;
}
public void setbikenum(String bikenum)
{
 this.bikenum=bikenum;
 System.out.println("bikenum properties are initialize");
}
}




