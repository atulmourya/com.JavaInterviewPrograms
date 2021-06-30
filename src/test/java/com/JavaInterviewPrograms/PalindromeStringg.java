package com.JavaInterviewPrograms;

public class PalindromeStringg {
	
	public static void main(String args[])
	{
		String main = "121";
		String reverse  = "";
		
		int strlength = main.length();
		
		for(int i = (strlength -1); i>=0; --i)
		{
			reverse = reverse + main.charAt(i);
		}
		
		if(main.toLowerCase().equals(reverse.toLowerCase()))
		{
			System.out.println(main+ " is Palindrome");	
		}
		else
		{
			System.out.println(main+ " is not Palindrome");	
		}
	}

}
