package com.gentech.javaiopackage;

import java.io.File;

public class DEmo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//createfolder();
		//createNestedfolder();
		//renamefile();
		//canread();
		//canwrite();
		//canexecute();
		//candelete();
		//getabsolutepath();
		//checkisfile();
		checkisfoleder();
	}
	public static void createfolder()
	{
		File f1=new File("D:\\Demo1\\Heeloo");
		boolean v1=f1.mkdirs();
		System.out.println(v1);
	}
	public static void createNestedfolder()
	{
		File f1=new File("D:\\Demo1\\Deev1\\Deev2\\Deev3\\Deev4");
		boolean v1=f1.mkdirs();
		System.out.println(v1);
	}
	public static void renamefile()
	{
		File f1=new File("D:\\Demo1\\Heeloo");
		File f2=new File("D:\\\\Demo1\\HELLO");
		boolean v2=f1.renameTo(f2);
		System.out.println(v2);
	}
	public static void canread()
	{
		File f1=new File("D:\\Demo1\\HELLO");
		boolean v1=f1.canRead();
		System.out.println(v1);
	}
	public static void canwrite()
	{
		File f1=new File("D:\\Demo1\\HELLO");
		boolean v1=f1.canWrite();
		System.out.println(v1);
	}
	public static void canexecute()
	{
		File f1=new File("D:\\Demo1\\HELLO");
		boolean v1=f1.canExecute();
		System.out.println(v1);
	}
	public static void candelete()
	{
		File f1=new File("D:\\Demo1\\HELLO");
		boolean v1=f1.delete();
		System.out.println(v1);
	}
	public static void getabsolutepath()
	{
		File f1=new File("D:\\Demo1\\HELLO");
		String s =f1.getAbsolutePath();
		System.out.println(s);
	}
	public static void checkisfile()
	{
		File f1=new File("D:\\Demo1\\HELLO");
		boolean s =f1.isFile();
		System.out.println(s);
	}
	public static void checkisfoleder()
	{
		File f1=new File("D:\\Demo1\\HELLO");
		boolean s =f1.isDirectory();
		System.out.println(s);
	}
	
}
