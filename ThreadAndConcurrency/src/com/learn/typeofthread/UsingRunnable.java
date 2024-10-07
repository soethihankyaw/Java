package com.learn.typeofthread;

public class UsingRunnable {
	
	public static void main(String[] args) {
		Thread runnableThread = new Thread(new MyRunnable());
		runnableThread.start();
	}
	
	public static class MyRunnable implements Runnable {

		@Override
		public void run() {
			System.out.println("MyRunnable is running...");
			System.out.println("MyRunnable is stopped!!!");
		}
		
	}
}
