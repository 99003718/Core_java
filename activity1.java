package com.ltts;

import java.util.Scanner;

public class activity1 {

public int checkLeapYear(int a)
{
	if (a < 0)
	{
		return (-1);
	}
	if (a%400 == 0)
	{
		return (1);
	}
	if (a%100 == 0)
	{
		return (0);
	}
	if (a%4 == 0)
	{
		return (1);
	}
	
	else
	{
		return (-1);
	}
}
public static void main(String[] args) {
	
	something s = new something();
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter Year");
    int i = sc.nextInt();
	int b = s.checkLeapYear(i);
	
	if (b == 0)
	{
		System.out.println("No");
	}
	if(b==1)
	{
		System.out.println("Yes");
	}
	if(b<0)
	{
		System.out.println("Invalid Input");
	}

}
}
