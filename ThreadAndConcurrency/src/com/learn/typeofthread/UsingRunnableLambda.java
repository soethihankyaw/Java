package com.learn.typeofthread;

public class UsingRunnableLambda {
	
	public static void main(String[] args) {
		Runnable runnable = () -> {
			var threadName = Thread.currentThread().getName();
			System.out.println(threadName + " is running...");
			System.out.println(threadName + " is stopped...");
		};
		
		Thread myThread = new Thread(runnable, "Runnable Lambda");
		myThread.start();
	}
}
