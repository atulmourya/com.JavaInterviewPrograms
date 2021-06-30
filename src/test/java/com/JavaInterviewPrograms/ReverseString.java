package com.JavaInterviewPrograms;
import java.util.Scanner;

public class ReverseString 
{
	
//https://www.geeksforgeeks.org/reverse-a-string-in-java/
	
	/*public static void main(String args[])
	{
		String reverseString = "java";
		
		// getBytes() method to convert string into bytes[].
		byte[] temp = reverseString.getBytes();
				
		byte[] result = new byte[temp.length];
				
		// Store result in reverse order into the result byte[]
		for(int i =0 ; i<temp.length; i++)
		{
			result[i] = temp[temp.length-i-1];
					
		}
		
		System.out.println(new String(result));
		
	}*/
	
	
	//Reverse String Using Character Arrya
	public static void main(String args[])
	{
		System.out.println("Enter String to reverse");
		
		Scanner scn = new Scanner(System.in);
		
		String rev = scn.nextLine();
		char [] array = rev.toCharArray();
		
		for(int i = array.length-1; i>=0; i--)
		System.out.print(array[i]);
	}

}
