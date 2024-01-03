package com.learn;

import java.util.Arrays;

public class Indexes {
	
	public static void main(String[] args) {
		
		var str = "Hello Java";
		
		//searching in string 
		System.out.println("IndexOf : " + str.indexOf("a"));
		System.out.println("IndexOf : " + str.indexOf('J', 0, 7));
		System.out.println("LastInedxOf : " + str.lastIndexOf(str));
		
		searchIndexes(str, 'a');
	}
	
	public static void searchIndexes(String s, char c) {
		int [] array = {};
		int index = -1;
		
		while((index = s.indexOf(c, index + 1)) >= 0) {
			array = Arrays.copyOf(array, array.length + 1);
			array[array.length - 1] = index;
		}
		
		 System.out.print("[");
	        for (int i = 0; i < array.length; i++) {
	            System.out.print(array[i]);
	            if (i < array.length - 1) {
	                System.out.print(", ");
	            }
	        }
	        System.out.println("]");
	}
}
