package com.JavaInterviewPrograms;

public class DemoClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("static method called ");
		
		
		String a = "demood";
		
		char [] rev= a.toCharArray();
		
		for(int i=0; i<a.length(); i++)
			{
				for(int j=i+1; j<a.length(); j++)
				{
					if(rev[i]==rev[j])
					{
						System.out.print(rev[j]+" ");
						//break;
					}
				}
			}
		
		/*String reverse = "";
		
		for(int i=(a.length()-1); i>=0; i--)
		{
			reverse = reverse+rev[i];
		}
		System.out.println(reverse);*/
		
//		int [] a= {4,5,8,9,6,7,2,1};
//		int temp=0;
//		for(int i=0; i<a.length; i++)
//		{
//			for(int j=i+1; j<a.length; j++)
//			{
//				if(a[i]>a[j])
//				{
//					temp = a[i];
//					a[i] = a[j];
//					a[j] = temp;
//				}
//			}
//		}
//		
//		for(int i=0; i<a.length; i++)
//		{
//		System.out.println(a[i]);
//		}
	}
}
