package com.gentech.javaiopackage;

import java.io.FileOutputStream;

public class ByteStreamDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		writefile();
	}
	public static void writefile()
	{
		FileOutputStream fout=null;
		try
		{
			fout=new FileOutputStream("D:\\Demo1\\Firstfile.txt");
			String str="Lion is the King of the forest";
			str+="and it is a King of another forest also.";
			byte b[]=str.getBytes();
			fout.write(b);
		}catch (Exception e)
		{
			e.printStackTrace();
		}finally
		{
			try
			{
				fout.close();
			}catch(Exception e)
			
			{
				e.printStackTrace();
			}
		}
				
	}
}
