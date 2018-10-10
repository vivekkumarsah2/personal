package com.capgemini.core;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Register {

	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);		
		
		Pattern namePattern = Pattern.compile("[a-zA-Z]");
		
		System.out.println("Enter Your Name");
		
		
		String name= s.next();
		
		 while(!namePattern.matcher(name).matches()) {
             System.out.println("Please provide a valid name");
             
             name= s.next();
         }		
		
		
		
		
		System.out.println("Enter Your Passport no.");
		
		
		String pass = s.next(); 
		
		while(pass.length()!= 7){
			
			System.out.println("Please provide a valid passport number");
			
			pass=s.next();
		}
					
			
		
		
		
		s.close();
		
	}

}
