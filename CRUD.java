package com.ltts;
import java.util.ArrayList;
import java.util.Scanner;
public class CRUD {
	
	static ArrayList<Integer> h = new ArrayList<Integer>();
	
	static void create()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("---Creating---");
		System.out.println("Enter element:");
	     int i = sc.nextInt();
	     h.add(i);
	}
	
	static void read()
	{	
		System.out.println("---Reading---");
		System.out.println(h);
	}
	
	static void update()
	{
		System.out.println("Enter index of element you want to update");
		Scanner sc = new Scanner(System.in);
	    int i = sc.nextInt();
	    
	    System.out.println("Enter updated element:");
	    Scanner gh = new Scanner(System.in);
	    int o = gh.nextInt();
	    h.set(i, o);
		
	}
	
	static void delete()
	{
		System.out.println("Enter index of element you want to delete");
		Scanner sc = new Scanner(System.in);
	    int i = sc.nextInt();
		h.remove(i);
	}
	
	public static void main(String[] args) {
		/*h.add("one");
		h.add(2);
		h.add(3.0);
		*/
		int type;
		do
		{
		System.out.println("1.Create\n2.Read\n3.Update\n4.Delete\n5.Exit");
		System.out.println("Enter choice:");
		
		Scanner a = new Scanner(System.in);
		type = a.nextInt();
		
		
			switch (type) {
			case 1:
				create();
				break;
			case 2:
				read();
				break;
			case 3:
				update();
				break;
			case 4:
				delete();
				break;
			default:
				break;
		}
	}while(type!=5);
	}
}