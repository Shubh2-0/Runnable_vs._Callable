package com.masai;

import java.time.LocalDate;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class c1 implements Callable<String>{
	
	@Override
	public String call() throws Exception {
		
		return LocalDate.now().toString();		
		
	}
	
}



public class CallableDemo {
	

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		
		c1 callable1 = new c1();
		
		ExecutorService executor = Executors.newFixedThreadPool(1);
		
		Future<String> res = executor.submit(callable1);
		
		System.out.println(res.get());
		
		
		
	}
	
	
	
	
	
	
	

}
