package com.ltts;

import java.util.Scanner;

class Vehicle
{	
	protected String make;
	protected String vehicleNumber ;
	protected String fuelType;
	protected int fuelCapacity;
	protected int cc;
	
	public Vehicle(String make,String vehicleNumber,String fuelType,Integer fuelCapacity,Integer cc)
	{
		 this.make = make;
		 this.vehicleNumber = vehicleNumber;
		 this.fuelType = fuelType;
		 this.fuelCapacity = fuelCapacity;
		 this.cc = cc;
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
	public TwoWheeler(String make,String vehicleNumber,String fuelType,Integer fuelCapacity,Integer cc,boolean kiclStartAvaialble) 
	{
		super(make,vehicleNumber,fuelType,fuelCapacity,cc);
		this.setKickStartAvailable(kickStartAvailable);
	}
	
	void displayDetailinfo()
	{
		System.out.println("---Detail Information---");
		if(isKickStartAvailable())
		{
			System.out.println("Kick Start Available:YES");
		}
		else
		{
			System.out.println("Kick Start Not Available:NO");
		}
	}

	public boolean isKickStartAvailable() {
		return kickStartAvailable;
	}

	public void setKickStartAvailable(boolean kickStartAvailable) {
		this.kickStartAvailable = kickStartAvailable;
	}
}

class FourWheeler extends Vehicle
{
	private String audioSystem;
	private int noOfDoors;
	public FourWheeler(String make,String vehicleNumber,String fuelType,Integer fuelCapacity,Integer cc, String audioSystem,int noOfDoors) 
	{
		super(make,vehicleNumber,fuelType,fuelCapacity,cc);
		this.setAudioSystem(audioSystem);
		this.setNoOfDoors(noOfDoors);
	}
	
	public void displayDetailinfo() 
	{
		System.out.println("---Detail Information---");
		System.out.println("Audio System:"+getAudioSystem());
		System.out.println("Number of Doors:"+getNoOfDoors());
	}

	public String getAudioSystem() {
		return audioSystem;
	}

	public void setAudioSystem(String audioSystem) {
		this.audioSystem = audioSystem;
	}

	public int getNoOfDoors() {
		return noOfDoors;
	}

	public void setNoOfDoors(int noOfDoors) {
		this.noOfDoors = noOfDoors;
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
			f.setAudioSystem(i4);
			
			System.out.println("Number Of Doors:");
			Scanner h = new Scanner(System.in);
			int i5 = h.nextInt();
			f.setNoOfDoors(i5);
			
			f.displayBasicinfo();
			f.displayDetailinfo();
		}
		if (i==2)
		{
			TwoWheeler f = new TwoWheeler(null, null, null, i, i, false);
			System.out.println("Vehicle Make:\n");
			Scanner a = new Scanner(System.in);
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
			System.out.println("Kick Start Available:");
			Scanner g = new Scanner(System.in);
			boolean i4 = g.nextBoolean();
			
			f.setKickStartAvailable(i4);
			
			f.displayBasicinfo();
			f.displayDetailinfo();
		}
	}
}
