package com.gentech.staticmethods;
class Student
{
	static String subname;
	static int marks;
	
	static
	{
		subname="Maths";
		marks=90;
	}
		
	
	static void showsubname()
	{
		System.out.println(subname);
	}
	static void showmarks()
	{
		System.out.println(marks);
	}
}

public class Staticdemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student.showsubname();
		Student.showmarks();
		
	}

}
