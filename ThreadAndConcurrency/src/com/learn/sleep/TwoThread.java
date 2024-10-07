package com.learn.sleep;

public class TwoThread {
	
	public static void main(String[] args) {
		Runnable runnable = () -> {
			var threadName = Thread.currentThread().getName();
			System.out.println(threadName + " is running...");
			System.out.println(threadName + " is stopped...");
		};
		
		Thread myThread1 = new Thread(runnable, "Thread 1");
		myThread1.start();
		Thread myThread2 = new Thread(runnable, "Thread 2");
		myThread2.start();
	}
}
