package com.JavaInterviewPrograms;

import java.util.Arrays;

public class AnagramProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String first = "abcd";
		String second = "dcba";
		
		char[] a =first.toCharArray();
		char[] b =second.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		if(Arrays.equals(a, b))
		{
			System.out.println("Text is anagram");
		}
		else 
		{
			System.out.println("Text is not anagram");
		}

	}

}
