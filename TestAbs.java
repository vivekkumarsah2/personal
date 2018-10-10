package com.capgemini.core;

import com.capgemini.Abstract.AbsClass1;

public class TestAbs extends AbsClass1{

	public void display(){
		
		System.out.println("Called from TestAbs");
	}


public static void main(String[] args){
	
	TestAbs abs = new TestAbs();
	abs.display();
	abs.callme();
	
}

}