package hk;


public class Sample {
static int a=10;
static {
	System.out.println("Fromm sb");
	System.out.println("a:"+a);
	System.out.println("b:"+Sample.b);
}
public static void main(String args[])
{
	System.out.println("Fromm mm");
	System.out.println("a:"+a);
	System.out.println("b:"+b);

	
}
static int b=20;
}
