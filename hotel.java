package com.ltts;

import java.util.Scanner;

class HotelRoom
{
	protected String hotelName;
	protected int numberOfSqFeet;
	protected boolean hasTV;
	protected boolean hasWifi;
	
	public HotelRoom(String hotelName,Integer numberOfSqFeet,Boolean hasTV,Boolean hasWifi)
	{
		this.hotelName = hotelName;
		this.numberOfSqFeet = numberOfSqFeet;
		this.hasTV = hasTV;
		this.hasWifi = hasWifi;
	}
	
	int calculateTariff(int ratePerSqFeet)
	{
		
		return (numberOfSqFeet*ratePerSqFeet);
	}
}
class deluxeRoom extends HotelRoom
{
	protected int ratePerSqFeet;
	
	public deluxeRoom(String hotelName,Integer numberOfSqFeet,Boolean hasTV,Boolean hasWifi)
	{
		super( hotelName, numberOfSqFeet, hasTV, hasWifi);
		this.ratePerSqFeet = 10;
	}
	public int getRatePerSqFeet()
	{
		if (hasWifi)
		{
			return(ratePerSqFeet + 2);
		}
		else
			return (ratePerSqFeet);
	}
	
}

class DeluxeACRoom extends deluxeRoom
{
	public DeluxeACRoom(String hotelName,Integer numberOfSqFeet,Boolean hasTV,Boolean hasWifi,int ratePerSqFeet)
	{
		super( hotelName, numberOfSqFeet, hasTV, hasWifi);
		this.ratePerSqFeet = 12;
	}
}

class SuiteACRoom extends HotelRoom
{
	private int ratePerSqFeet;
	
	public SuiteACRoom(String hotelName,Integer numberOfSqFeet,Boolean hasTV,Boolean hasWifi)
	{
		super( hotelName, numberOfSqFeet, hasTV, hasWifi);
		this.ratePerSqFeet = 15;
	}
	public int getRatePerSqFeet()
	{
		if (hasWifi)
		{
			ratePerSqFeet = ratePerSqFeet + 2;
			return(ratePerSqFeet);
		}
		else
			return (ratePerSqFeet);
	}
}
public class hotel {
	
	public static void main(String[] args) {
		
		System.out.println("1. Deluxe Room\n2. Deluxe AC Room\n3. Suite AC Room\r\n");
		System.out.println("Select Room Tyoe:");
		Scanner sc = new Scanner(System.in);
	    int i = sc.nextInt();
	    
	    if (i==1)
	    {
	    	deluxeRoom d = new deluxeRoom(null, i, false, false);
	    	System.out.println("Hotel Name:");
	    	Scanner a = new Scanner(System.in);
		    String i1 = a.next();
		    d.hotelName = i1;
		    
		    System.out.println("Room Square Feet Area:");
		    Scanner b = new Scanner(System.in);
		    int i2 = b.nextInt();
		    d.numberOfSqFeet = i2;
		    
		    System.out.println("Room has TV:");
		    Scanner c = new Scanner(System.in);
		    boolean i3 = c.nextBoolean();
		    d.hasTV = i3;
		    
		    System.out.println("Room has Wifi:");
		    Scanner e = new Scanner(System.in);
		    boolean i4 = e.nextBoolean();
		    d.hasWifi = i4;
		    int i5= d.getRatePerSqFeet();
		    System.out.println("Room Tariff per day is:"+d.calculateTariff(i5));
	    }
	}
}
