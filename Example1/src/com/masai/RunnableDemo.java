package com.masai;

class run1 implements Runnable{
	@Override
	public void run() {
	
		System.out.println("i am a class which implements runnable interface");
		
	}
}


public class RunnableDemo {
	
	
	public static void main(String[] args) {
		
	Runnable r2 = () -> System.out.println("i am runnable which is made using lambda expression");	
	
	run1 r1 = new run1();
	
	Thread t2 = new Thread(r2);
	Thread t1 = new Thread(r1);
	
	t1.start();
	t2.start();
	
		
	}
	

}
