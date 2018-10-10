package com.capgemini.Multithreading;

public class MyOwnThread implements Runnable{
	

	public void run() {
		String name = Thread.currentThread().getName();
		
		try{
		Thread.sleep(3000);//sleep is static method
		System.out.println("custom thread using runnable: " + name);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		
		
	}

	public static void main(String[] args) throws InterruptedException {
		
		MyOwnThread mt = new MyOwnThread();
		
		Thread t = new Thread(mt);
		t.start();
		t.setName("thread1");
		//runnable is preferred because we can extyend another class which is not possible using thread class 
		//extending thread class means we can't extend another class due to no sipport for 
		// multiple inheritance in java
		
		//extends comes first and then implements
		
		//two threads are running : main thread and our custom thread . main thread is adefault
		//thread in java
		//jvm executes main as a thread and not as a method because implementation starts
		//with main and execution goes line by line which requires a single thread of execution.
		
		Thread t2 = new Thread(mt);
		t2.start();
		t.join();
		t2.setName("thread2");
		//now we have three threads.
		
		//The execution sequence of a thread purely depends on jvm.
		//default priority for main thread is 5
		
	}

}
