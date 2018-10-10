package com.capgemini.Multithreading;

public class MyThread extends Thread {
	
	public void run(){
		
		System.out.println("Custom Thread: MyThread");
		
	}

	public static void main(String[] args) {
		
			MyThread mt = new MyThread();
			mt.start();//start internally invokes run
			
			//thread is a class of java.lang that's why no need to import
			//start method invokes a single thread of execution.
			//mt.run() would have implemented program in a normal multithreading way of execution.
	}

}
