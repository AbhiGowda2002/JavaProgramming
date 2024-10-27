package com.gentech.javaiopackage;

import java.io.File;

public class demodemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//createfolder();
		//createnestedfolder();
		//renamefolder();
		//deletefolder();
		listfolder();

	}
	public static void createfolder()
	{
		File f1=new File("D:\\Demo1\\hello");
		boolean v1=f1.mkdirs();
		System.out.println(v1);
	}
	public static void createnestedfolder()
	{
		File f1=new File("D:\\Demo1\\Dev1\\Dev2\\Dev3\\Dev4\\");
		boolean v2=f1.mkdirs();
		System.out.println(v2);
	}
	public static void renamefolder()
	{
		File f1=new File("D:\\Demo1\\hello");
		File f2=new File("D:\\Demo1\\hello world");
		boolean v3=f1.renameTo(f2);
		System.out.println(v3);
	}
	public static void deletefolder()
	{
		File f1=new File("D:\\Demo1\\hello world");
		boolean v4=f1.delete();
		System.out.println(v4);
		
	}
	public static void listfolder()
	{
		File f2=new File("D:\\Demo1");
		File f[]=f2.listFiles();
		for(int i=0;i<f.length;i++)
		{
			if(f[i].isDirectory()==true)
			{
				String path=f[i].getAbsolutePath();
				System.out.println(path);
			}
		}
	}
}
