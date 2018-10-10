package com.capgemini.Abstract;

import java.io.Serializable;

public class Employee implements Serializable{

	private Integer id;
	
	private String name;
	
	private Double salary;
	
	public Integer getId(){		
		return id;		
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary
				+ "]";
	}

	public void setId(int i) {
		// TODO Auto-generated method stub
		
	}

	public void setName(String string) {
		// TODO Auto-generated method stub
		
	}

	public void setSalary(double d) {
		// TODO Auto-generated method stub
		
	}
	
	

}
