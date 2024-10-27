package com.gentech.javaiopackage;

import java.io.File;

public class DEmo1 {

	public static void main(String[] args) {
		File f1=new File("D:\\Demo1\\firstfile.txt");
		//display name of the file
		
		String name=f1.getName();
		System.out.println("file name:"+name);
		
		// display absolute path
		String path1=f1.getAbsolutePath();
		System.out.println(path1);
		
		File f=f1.getAbsoluteFile();
		System.out.println(f);
		
		//verify that it is a file or not
		boolean v2=f1.isFile();
		System.out.println(v2);
		
		boolean v3=f1.isDirectory();
		System.out.println(v3);
		
		String path=f1.getParent();
		System.out.println(path);
		
		boolean red=f1.canRead();
		System.out.println(red);
		
		boolean v5=f1.canWrite();
		System.out.println(v5);
		
		boolean v6=f1.canExecute();
		System.out.println(v6);
	}

}
