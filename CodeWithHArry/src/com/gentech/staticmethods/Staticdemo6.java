package com.gentech.staticmethods;
class Student1
{
	static String subject;
	static int marks;
	
	static 
	{
		subject="maths";
		System.out.println(subject);
		marks=99;
		System.out.println(marks);
	}
	
}
public class Staticdemo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 o=new Student1();
		System.out.println("main method is executed");
	}

}
