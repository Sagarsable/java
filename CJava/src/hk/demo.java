package hk;
class demo1{static int a=10;}
class demo {

int a=20;
void m1()
{
	int a=30;
	System.out.println(demo1.a);
	System.out.println(this.a);
	System.out.println(a);
}
public static void main(String[]args)
{
	
	demo d=new demo();
	d.m1();
}

}
