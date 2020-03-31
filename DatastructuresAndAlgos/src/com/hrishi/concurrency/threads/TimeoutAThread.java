package com.hrishi.concurrency.threads;

public class TimeoutAThread {

	public static void main(String[] args) {

		Thread thread = new Thread(new TimeoutAThread().new LongRunningThread());
		thread.start();
		
		// The following can be also called after a necessary timeout using Thread.sleep()
		thread.interrupt();
	}
	
	class LongRunningThread implements Runnable {
		@Override
		public void run() {
			int i = 0;
			while(i < 1000) {
				System.out.println("Running thread at " + i);
				
				if(Thread.currentThread().interrupted()) {
					System.out.println("Thread interrupted");
					return;
				}
				
				try {
					Thread.sleep(10_000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				i++;
			}
		}
	}

}
