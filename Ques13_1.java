package com.capgemini.labbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ques13_1 implements Runnable
{
	FileInputStream fis = null;
	FileOutputStream fos = null;

	@Override
	public void run() 
	{
		try
		{
			fis = new FileInputStream("practice.txt");
			fos = new FileOutputStream("target.txt");
			int ch,c=0;
			while((ch=fis.read())!=-1)
			{
				System.out.print((char)ch);	//type casting from int to char; printed on console character-wise
				fos.write(ch);
				c++;
				if(c%10==0)
				{
					System.out.println("\nDelay of 5 sec after 10 characters");
					Thread.sleep(5000);    //it is static method we use class name.method()
					c=0;
				}
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		catch(InterruptedException e1)
		{
			e1.printStackTrace();
		}
		finally
		{
			try
			{
				fis.close();
				fos.close();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) throws InterruptedException,IOException
	{
		Ques13_1 lb = new Ques13_1();
		Thread t = new Thread(lb);
		t.start();
	}
}
