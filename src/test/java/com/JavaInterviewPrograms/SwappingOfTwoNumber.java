package com.JavaInterviewPrograms;

import java.util.Scanner;

public class SwappingOfTwoNumber {
	
	public static void main(String args[])
	{
		int[] num;
		num = new int[2];
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Enter two numbers for swipe");
		
		for(int i=0; i<=1; i++)
		{
			
			num[i]= scr.nextInt();
		}
		
		int a=num[0], b=num[1];
		System.out.println("Nummber before swapping is a="+a+" b="+b);
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("Nummber after swapping is a="+a+" b="+b);
		
		
		
	}

}
