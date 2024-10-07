package com.learn.stop;

public class StopRunnableThread {
	
	public static void main(String[] args) {
		StoppableRunnable runnable = new StoppableRunnable();
		Thread thread = new Thread( runnable);
		thread.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Requesting Thread to stop");
		runnable.requestStop();
		System.out.println("Stopping Thread...");
	}
	
	public static class StoppableRunnable implements Runnable {
		
		private boolean stopRequested = false;

		@Override
		public void run() {
			System.out.println("StoppableRunnable is running...");
			
			while( !isStopRequested() ) {
				sleep(1000);
				System.out.println("...");
			}
			System.out.println("StoppableRunnable is stopped...");
		}
		
		public synchronized void requestStop() {
			this.stopRequested = true;
		}
		
		public synchronized boolean isStopRequested() {
			return this.stopRequested;
		}
		
		private void sleep(long millis) {
			try {
				Thread.sleep(millis);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
