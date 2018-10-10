package com.capgemini.Abstract;

import java.io.*;
public class WriteAFile {

	public static void main(String[] args) throws IOException {
	
			FileOutputStream fos = new FileOutputStream("sample.txt");
			
			String s = "hello Mr. Vivek good morning";
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			String sc = br.readLine();
			
			System.out.println("entered using BR:" + sc);
			
			fos.write(s.getBytes());
			fos.close();

	}

}
