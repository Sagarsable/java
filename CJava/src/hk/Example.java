package hk;

public class Example {
	
		public static void main(String[] args) 
		{
			int i, j, count,S=0; 
			
			System.out.println(" Prime Numbers from 1 to 100 are : ");	
			for(i = 2; i <= 100; i++)
			{
				count = 0;
			    for (j = 1; j <= i; j++)
			    {
			    	if(i % j == 0)
			         	{
			    		count++;
			    		
			    	}
			    }
			    if(count == 2 )
			    {
			    	System.out.print(i+ " ");
			    	S=S+i;
			    	
			    	
			    }  
			}
			System.out.println( " ");
			System.out.print("Sum of Prime no from 1 to 100 is: ");
			System.out.println("Sum:"+S);
		}
	}