package com.ltts;

import java.util.Scanner;

class Vehicle
{	
	protected String make;
	protected String vehicleNumber ;
	protected String fuelType;
	protected int fuelCapacity;
	protected int cc;
	
	public Vehicle(String Mk,String vn,String ft,Integer fc,Integer CC)
	{
		 make = Mk;
		 vehicleNumber = vn;
		 fuelType = ft;
		 fuelCapacity = fc;
		 cc = CC;
	}
	
	void displayMake()
	{
		
	}
	 void displayBasicinfo()
	 {
		 System.out.println("---Basic Information---");
		 System.out.println("Vehicle Number:"+vehicleNumber);
		 System.out.println("Fuel Capacity:"+fuelCapacity);
		 System.out.println("Fuel Type:"+fuelType);
		 System.out.println("Engine CC:"+cc);
	 }
	 void displayDetailinfo()
	 {
		 System.out.println("---Detail Information---");
	 }
	 
}

class TwoWheeler extends Vehicle
{
	private boolean kickStartAvailable ;
	public TwoWheeler(String Mk,String vn,String ft,Integer fc,Integer CC,boolean ks) 
	{
		super(Mk,vn,ft,fc,CC);
		kickStartAvailable = ks;
	}
	
	void displayDetailinfo()
	{
		if(kickStartAvailable)
		{
			System.out.println("Kick Start Available:YES");
		}
		else
		{
			System.out.println("Kick Start Not Available:NO");
		}
	}
}

class FourWheeler extends Vehicle
{
	private String audioSystem;
	private int noOfDoors;
	public FourWheeler(String Mk,String vn,String ft,Integer fc,Integer CC, String as,int nd) 
	{
		super(Mk,vn,ft,fc,CC);
		audioSystem = as;
		noOfDoors = nd;
	}
	
	public void displayDetailinfo() 
	{
		System.out.println("Audio System:"+audioSystem);
		System.out.println("Number of Doors:"+noOfDoors);
	}
}

public class activity2 {
	
	public static void main(String[] args) {
		
		
		System.out.println("1.Four Wheeler\n2.Two Wheeler");
		System.out.println("Enter Vehicle Type");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		
		if(i==1)
		{
			FourWheeler f = new FourWheeler(null, null, null, i, i, null, i);
			Scanner a = new Scanner(System.in);
			System.out.println("Vehicle Make:\n");
			String s = a.next();
			f.make = s;
			
			Scanner b = new Scanner(System.in);
			System.out.println("Vehicle Number:\n");
			String s1 = b.next();
			f.vehicleNumber = s1;
			
			System.out.println("FuelType:\n1.Petrol\n2.Diesel");
			Scanner c = new Scanner(System.in);
			int i1 = c.nextInt();
			
			if (i1==1)
			{
				f.fuelType = "Petrol";
			}
			else
			{
				f.fuelType = "Diesel";
			}
			
			System.out.println("Fuel Capacity:");
			Scanner d = new Scanner(System.in);
			int i2 = d.nextInt();
			
			f.fuelCapacity = i2;
			
			System.out.println("Engine CC:");
			Scanner e = new Scanner(System.in);
			int i3 = e.nextInt();
			
			f.cc = i3;
			
			System.out.println("Audio System:");
			Scanner g = new Scanner(System.in);
			String i4 = g.next();
			f.audioSystem = i4;
			
		}
	}
}
