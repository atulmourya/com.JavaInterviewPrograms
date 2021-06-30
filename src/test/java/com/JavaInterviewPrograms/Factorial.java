package com.JavaInterviewPrograms;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scr = new Scanner(System.in);
		System.out.print("Enter Number:-");
		int a=scr.nextInt();

		int fact = 1;
		
		for(int i=1; i<=a;i++)
		{
			fact = fact*i;
		}
		System.out.println("Factorial of "+a+" is:- "+fact);
	}

}
