package com.learn.array;

public class Main {
	
	public static void main(String[] args) {
		
		var array = new ArrayStructure();
		
		array.generate();
		array.printMyArray();
		array.getValueAt(1);
		array.doesContain(16);
		array.deleteAtIndex(0);
		array.printMyArray();
		array.insertValue(0, 11);
		array.printMyArray();
	}
}
