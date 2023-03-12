package com.masai;

import java.time.LocalDate;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo implements Callable<String> {
	
	
	@Override
	public String call() throws Exception {

		System.out.print("This task is perform by "+Thread.currentThread().getName()+" and the result is -> \t");
		return "Today is "+LocalDate.now().getDayOfWeek();
		
	}
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
	CallableDemo c1 = new CallableDemo();
	
	ExecutorService executor = Executors.newFixedThreadPool(10);
	
	
	for(int i = 0 ; i < 10 ; i++) {
		
	Future<String> day = executor.submit(c1);
	
	System.out.println(day.get());

	
	}
	
	executor.shutdown();
	
	
	
		
		
		
	}
	
	

}
