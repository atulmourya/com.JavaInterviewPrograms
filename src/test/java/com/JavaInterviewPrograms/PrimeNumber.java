package com.JavaInterviewPrograms;

public class PrimeNumber {

	public static void main(String agrs[])
	{
		
		int a = 29;
		boolean flag = false;
		
		for(int i=2; i<=a/2; i++)
		{
			if(a%i==0)
			{
				flag=true;
				break;
			}
		}
		
		if(!flag)
		{
			System.out.print(a+ " Number is prime");
		}
		else
		{
			System.out.print(a+ " Number not is prime");
		}
	}
}
