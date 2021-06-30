package com.demoJavaCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class DemoArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> ar = new ArrayList<String>();
		
		ar.add("Atul");
		ar.add("Mourya");
		ar.add("Rahul");
		ar.add("Nitesh");
		
		System.out.println(ar);
		
		for(int i=0; i<ar.size(); i++)
		{
			System.out.println("Using For Loop:- "+ar.get(i));
		}
		
		int count = 0;
		while(ar.size()>count)
		{
			System.out.println("Using While Loop:- "+ar.get(count));
			count++;
		}
		
		for(String a:ar)
		{
			System.out.println("Using For Each loop"+a);
		}
		
		Collections.sort(ar); // Sort arryalist
		
		//Collections.sort(ar,Collections.reverseOrder());//Sort on descending order
		
		Iterator i = ar.iterator();
		while(i.hasNext())
		{
			System.out.println("Using Iterator after sorting:- "+i.next());
		}
		
		
	}

}
