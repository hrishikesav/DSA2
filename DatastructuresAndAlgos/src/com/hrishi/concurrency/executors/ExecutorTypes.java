package com.hrishi.concurrency.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorTypes {

	public static void main(String[] args) {
		int processors = Runtime.getRuntime().availableProcessors();
		
		ExecutorService executorExecute = Executors.newFixedThreadPool(processors);
		executorExecute.execute(() -> {
			System.out.println("From execute");
		});
		
		System.out.println(processors);
	}

}
