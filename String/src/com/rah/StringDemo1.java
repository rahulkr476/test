package com.rah;

public class StringDemo1 {
	
	public static void main(String[] args) {

//		String Creation
		String s1 = "Rahul";
		String s2 = new String("Kumar");

		System.out.println("String 1 :" + s1);
		System.out.println("String 2 :" + s2);
		
		String s3 = s1.concat(s2);
		System.out.println("After concatination :" +s3);

	}

}
