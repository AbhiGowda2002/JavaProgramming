package com.gentech.questions;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Santosh";
		StringBuilder sb=new StringBuilder(name);
		String str=sb.reverse().toString();
		System.out.println(str);
		
		
		String name2="Abhishek";
		String s2=name2.replace('k', 'A');
		System.out.println(s2);
		
		String namee="Abhishekabhi";
		 int  i=namee.length();
		 System.out.println(i);
	}

}
