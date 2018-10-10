package com.capgemini.Abstract;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;



public class ReadAFile {

	public static void main(String[] args)throws IOException {
		
		//FileInputStream fis = new FileInputStream("sample.txt");
		FileReader f = new FileReader("sample.txt");
		
		/*int ch;
		while((ch=fis.read())!= -1){
			
			System.out.print((char)ch);
		}*/
		
		//fis.close();
		f.close();
	}

}
