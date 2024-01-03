package com.learn;

public class TypeChange {
	
	public static void main(String[] args) {
		
		var data = 10;
		
		System.out.println("Primitive Datatype : " + data);
		
		Integer wrapData = data;
		
		System.out.println("Wrapper data to String : " + wrapData.toString());
		System.out.println("Wrapper int to double : " + wrapData.doubleValue());
		
		var str = String.valueOf(data);
		
		System.out.println("Primitive to String : " + str);
		
		var integer = Integer.parseInt(str);
		
		System.out.println("String to primitive : " + integer);
		
		var doubles = Double.parseDouble(str);
		
		System.out.println("String to double : " + doubles);
		
	}
}
