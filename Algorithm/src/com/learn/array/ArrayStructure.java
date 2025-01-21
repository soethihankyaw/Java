package com.learn.array;

public class ArrayStructure {
	
	private int[] myArray = new int[50];
	
	private int arraySize = 10;
	
	public void generate() {
		
		for(var i = 0; i < arraySize; i++ ) {
			
			myArray[i] = (int) (Math.random() * 10) + 10;
		}
	}
	
	public void printMyArray() {
		
		System.out.println("----------");
		for(var i = 0; i < arraySize; i++) {
			System.out.print("| " + i + " | "); 
			System.out.println(myArray[i] + " | ");
			System.out.println("----------");
		}
	}
	
	public void getValueAt(int index) {
		
		if(index < arraySize) {
			System.out.printf("Value At [%s] : %d", index, myArray[index]);
		}
		else {
			System.out.printf("%d is zero.", index);
		}
		
		System.out.println("");
		
	}
	
	public void doesContain (int value) {
		
		var isContain = false;
		for(var i = 0; i < arraySize; i++) {
			if(myArray[i] == value) {
				isContain = true;
			}
		}
		
		if(isContain) {
			System.out.printf("%d is contain in array.", value);
		}
		else {
			System.out.printf("%d does not contain in array.", value);
		}
		System.out.println("");
		
	}
	
	public void deleteAtIndex(int index) {
		
		if(index < arraySize) {
			for(var i = index; i < arraySize - 1; i++) {
				myArray[i] = myArray[i + 1];
			}
		}
		
		arraySize--;
	}
	
	public void insertValue(int index, int value) {
		
		if(index < arraySize) {
			arraySize++;
			myArray[index] = value;
		}
	}
}
