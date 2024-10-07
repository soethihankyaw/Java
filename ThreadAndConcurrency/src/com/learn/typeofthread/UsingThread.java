package com.learn.typeofthread;

public class UsingThread {
	
	public static void main(String[] args) {
		MyThread mythread = new MyThread();
		mythread.start();
	}
	
	public static class MyThread extends Thread {
		public void run() {
			System.out.println("My Thread is Running!");
			System.out.println("My Thread is Finished!");
		}
	}
}
