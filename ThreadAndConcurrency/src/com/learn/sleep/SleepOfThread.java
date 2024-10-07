package com.learn.sleep;

public class SleepOfThread {
	
	public static void main(String[] args) {
		Runnable runnable = () -> {
			var threadName = Thread.currentThread().getName();
			
			System.out.println(threadName + " is running...");
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(threadName + " is stopped...");
			
		};
		
		Thread myThread = new Thread(runnable, "The Thread");
		myThread.start();
	}
}
