package com.gentech.strings;

public class StringDemo2 {

	public static void main(String[] args) {
		getcharcount();
		getvalidate();
		getchar();
		upperdemo();
	    getlowercase();
	    Replacedemo();
	    compare();

	}
	public static void getcharcount()
	{
		String name="abhishek ";
		int v1=name.length();
		System.out.println(v1);
	}
	public static void getvalidate()
	{
		String s=new String();
		boolean b=s.isEmpty();
		System.out.println("it is empty "+b);
	}
	public static void getchar()
	{
		String s ="Abhishek";
		char v=s.charAt(1);
		System.out.println(v);
	}
	public static void upperdemo()
	{
		String s ="abhishek";
		String s1=s.toUpperCase();
		System.out.println(s1);
	}
	public static void getlowercase()
	{
		String s="VIDYADHARI";
		String s1=s.toLowerCase();
		System.out.println(s1);
	}
	public static void Replacedemo()
	{
		String name="varsha";
		String s1=name.replace('v', 'h');
		System.out.println(s1);
	}
	public static void compare()
	{
		String s1="JAVA";
		String s2="java";
		boolean b=s1.equals(s2);
		System.out.println(b);
		
	}
	
}
