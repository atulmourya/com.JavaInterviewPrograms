package com.JavaInterviewPrograms;

public class RemoveSpecialCharater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String name = "My + name is + atul@!#$%^^^^ ";
		
		//name = name.replaceAll("[+]*", "");
		
		name = name.replaceAll("\\W+", " ");
		
		System.out.println(name);
	}

}
