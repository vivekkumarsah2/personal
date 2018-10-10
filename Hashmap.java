package com.capgemini.core;

import java.util.*;

public class Hashmap {

	public static void main(String[] args) {
		
		
		HashMap h = new HashMap();

		h.put(1,new String("pop"));
		
		h.put(2,new String("pops"));
		h.put(3,new String("pop"));
		h.put(3,new String("pop3"));
		
		System.out.println(h.values());
		
		
		
	}

}
