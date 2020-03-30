package com.hrishi.concurrency.executors;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class AsynchronousThreadExecution {

	public static void main(String[] args) {
		
		CompletableFuture<String> cf = CompletableFuture.completedFuture("completed future").thenApply(s -> {
	        return s + " then apply";
	    });
		
		CompletableFuture<String> cf2 = CompletableFuture.completedFuture("completed future").thenApplyAsync(s -> {
	        return s + " then apply async";
	    });
		
		CompletableFuture<Void> cf3 = CompletableFuture.completedFuture("completed future")
        .thenAccept(s -> System.out.println(s + " then accept"));

		
		try {
			System.out.println(cf.get());
			System.out.println(cf2.get());
			cf3.get();
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
	}
}
