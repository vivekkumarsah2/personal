package com.capgemini.Abstract;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadWrite {

	public static void main(String[] args) throws IOException{
		FileInputStream fis = new FileInputStream("sample.txt");
		
		FileOutputStream fos = new FileOutputStream("sample1.txt");
		
		Integer  ch;
		ch = fis.read();
		
		//String toString(ch);
		fos.write(ch.toString().getBytes());
	
		
		/*while((ch=fis.read())!= -1){
			
			System.out.print((char)ch);
		}*/
		
		
		fos.close();
		fis.close();

	}

}
