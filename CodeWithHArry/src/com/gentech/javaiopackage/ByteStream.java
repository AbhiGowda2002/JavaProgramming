package com.gentech.javaiopackage;

import java.io.File;
import java.io.FileInputStream;

public class ByteStream {

	public static void main(String[] args) {
		readfile();

	}
	public static void readfile()
	{
		FileInputStream fin=null;
		int n=0;
		try
		{
			fin=new FileInputStream("D:\\Demo1\\Firstfile.txt");
			while(true)
			{
				n=fin.read();
				if(n==-1)
				{
					break;
				}
				char ch=(char)n;
				System.out.print(ch);
			}
		}catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try {
				fin.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

}
