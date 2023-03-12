package com.masai;

import java.time.LocalDate;

public class RunnableDemo implements Runnable {
	
	@Override
	public void run() {
	
		System.out.println("Today is : "+LocalDate.now().getDayOfWeek());
		
	}
	
	public static void main(String[] args) {
		
	RunnableDemo r1 = new RunnableDemo();
	
	Runnable r2 = () -> System.out.println("Current Month : "+LocalDate.now().getMonth());
	
	Thread t1 = new Thread(r1);
	Thread t2 = new Thread(r2);
	t1.start();
	t2.start();
	
		
		
	}
	
	

}
