package com.ltts;

import java.util.Scanner;

/*class NumberFormatException
{
	public NumberFormatException()
	{
		System.out.println("NumberFormatException");
	}
}
*/
class BufferReader
{
	public int run;
	public int over;
	
	public BufferReader(int run,int over) {
		this.run = run;
		this.over = over;
	}

	
}

public class ExcHand1 {
	public static void main(String[] args) {
		
		BufferReader b = new BufferReader(0, 0);
		
		System.out.println("Enter the total runs scored");
		Scanner sc = new Scanner(System.in);
	    int i = sc.nextInt();
	    b.run = i;
	    
	    System.out.println("Enter the total overs faced");
		Scanner a = new Scanner(System.in);
	    int i1 = a.nextInt();
	    b.over = i1;
	    
	    try
	    {
	    	System.out.println("Run Rate:");
	    	double c= b.run/b.over;
	    	System.out.println(b.over);
	    	System.out.println(c);
	    }
	    catch(Exception e)
	    {
	    	System.out.println("NumberFormatException");
	    }
	}
}
