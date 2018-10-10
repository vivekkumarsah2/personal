package com.capgemini.Abstract;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeEmployee {

	public static void main(String[] args) throws IOException{
		
		Employee e1 = new Employee();
		e1.setId(123);
		e1.setName("Rakul");
		e1.setSalary(12000.00);
		//System.out.println(e1);

		FileOutputStream fos = new FileOutputStream("emp.txt");
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(e1);
		
		System.out.println("employee is serialized");
		
		fos.close();
		oos.close();
		
	}

}
