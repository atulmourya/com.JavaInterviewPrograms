package com.JavaInterviewPrograms;

import java.util.Scanner;

public class TableOfNumber {
	
	public static void main(String args[])
	{
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter number:- ");
		int a = scr.nextInt();
		int result;
		
		System.out.println("Table of "+a+" is");
		for(int i = 1; i<=10; i++)
		{
			result = i*a;
			System.out.print(result+" ");
		}
	}

}
