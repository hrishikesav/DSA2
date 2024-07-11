package com.hrishi.concurrency.executors;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class CallableFuture {

	public static void main(String[] args) {
		
		ExecutorService service = Executors.newSingleThreadExecutor();
		Future<Integer> future = service.submit(new CallableClass());
		try {
			System.out.println(future.get());
//			future.get(1000, TimeUnit.MILLISECONDS);
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		service.shutdown();
	}
	
	static class CallableClass implements Callable<Integer> {

		@Override
		public Integer call() throws Exception {
			return new Random().nextInt();
		}
		
	}
}
