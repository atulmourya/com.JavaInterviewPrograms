package com.JavaInterviewPrograms;

import java.util.Scanner;

public class DuplicateCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scr = new Scanner(System.in);
		 System.out.println("Enter string:- ");
		String str = scr.next();
		
	      char[] a = str.toCharArray();
	      
	      System.out.println("The string is:" + str);
	      
	      System.out.print("Duplicate Characters in above string are: ");
	      for (int i = 0; i < str.length(); i++)
	      {
	         for (int j = i + 1; j < str.length(); j++) 
	         {
	            if (a[i] == a[j])
	            {
	               System.out.print(a[j] + " ");
	               break;
	            }
	         }
	      }
	            

	}

}
