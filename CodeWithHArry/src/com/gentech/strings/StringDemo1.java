package com.gentech.strings;

public class StringDemo1 {

	public static void main(String[] args) {
		appenddemo();
		insretdemo();
		deletedemo();
		reversedemo();

	}
		public static void appenddemo()
		{
			StringBuffer sb=new StringBuffer("Java ");
			sb.append("Programming Language");
			System.out.println(sb);
		}
		public static  void insretdemo()
		{
			StringBuffer s=new StringBuffer("JAVA Programming Language");
			s.insert(0, "It is a ");
			System.out.println(s);
		}
		public static void deletedemo()
		{
			StringBuilder s=new StringBuilder("It is not a java programming language");
			s.delete(5, 9);
			System.out.println(s);
		}
		public static void reversedemo()
		{
			StringBuilder s=new StringBuilder("javajava");
			s.reverse();
			System.out.println("The reversed String is:"+s);
		}

}
