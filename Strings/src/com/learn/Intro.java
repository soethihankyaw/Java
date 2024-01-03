package com.learn;

public class Intro {
	
	public static void main(String[] args) {
		
		String str1 = "Hello";
		var str2 = "Hello";
		var str3 = new String("Hello");
		
		System.out.println("With Literals : " + str1 == str2);
		
		System.out.println("With New keyword : " + str2 == str3);
		
		System.out.println("Plus operator in String : " + 1 + "1" + 1);
	}
}
