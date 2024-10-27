package com.gentech.fileoperations;

import java.io.File;

public class FileOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	FileOperations.Createfile();
	//	FileOperations.CreateNestedFolder();
	//	RenameFolderName();
	//  RenameFileName();
	//	DeleteFile();
	//	DeleteFolder();
	//		DeleteFolder1();
	//		DeleteFolder2();
		ReadFile();
	}
	public static void Createfile()
	{
		File f=new File("D:\\Demoo\\Hello");
		boolean b=f.mkdirs();
		System.out.println(b);
	}
	
	public static void CreateNestedFolder()
	{
		File f1=new File("D:\\Development\\dev1\\dev2\\dev3");
		boolean b1=f1.mkdirs();
		System.out.println(b1);
	}
	public static void RenameFolderName()
	{
		File f2=new File("D:\\Development");
		File f3=new File("D:\\Developer");
		boolean b2=f2.renameTo(f3);
		System.out.println(b2);
	}
	public static void RenameFileName()
	{
		File f4=new File("D:\\Developer");
	    File f5=new File("D:\\Dev");
		boolean b3=f4.renameTo(f5);
		System.out.println(b3);
	}
	public static void DeleteFile()
	{
		File f1=new File("D:\\Dev\\dev1\\dev2\\dev3");
		boolean v=f1.delete();
		System.out.println(v);	
	}
	public static void DeleteFolder()
	{
		File f1=new File("D:\\Demoo\\Hello");
		boolean b11=f1.delete();
		System.out.println(b11);
	}
	public static void DeleteFolder1()
	{
		File f1=new File("D:\\Demoo");
		boolean b21=f1.delete();
		System.out.println(b21);
	}
	public static void DeleteFolder2()
	{
		File f1=new File("D:\\demo\\PatternDemo5.java");
		boolean b22=f1.delete();
		System.out.println(b22);
	}
	public static void ReadFile()
	{
		File f1=new File("D:\\Devworkspace");
		File f[]=f1.listFiles();
		for(int i=0;i<f.length;i++)
		{
			String path=f[i].getAbsolutePath();
			System.out.println(path);
		}
	}
}
