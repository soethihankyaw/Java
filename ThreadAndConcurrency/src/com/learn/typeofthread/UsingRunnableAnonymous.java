package com.learn.typeofthread;

public class UsingRunnableAnonymous {
	
	public static void main(String[] args) {
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Runnable Anonymous is running...");
				System.out.println("Runnable Anonymous is stopped...");
			}
		};
		
		Thread mythread = new Thread(runnable);
		mythread.start();
	}
	
	
}
