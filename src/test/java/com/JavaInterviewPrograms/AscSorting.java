package com.JavaInterviewPrograms;


public class AscSorting {
	
	//https://www.javatpoint.com/java-program-to-sort-the-elements-of-an-array-in-ascending-order
	
	public static void main(String args[])
	{
		int a[] = {1,9,3,2,1,4,5,7,9};
		int temp = 0;
		
		System.out.println("Before soritng ");
		for(int i=0; i < a.length; i++)
		{
			System.out.print(a[i]+ " ");
		}
		
		for(int i=0; i< a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]>a[j])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
					
			}
		}
		
		System.out.println();
		
		System.out.println("After sorting ");
		for(int i=0; i < a.length; i++)
		{
			System.out.print(a[i]+ " ");
		}
		
	}

}
