package com.gentech.oopsoops;
class Student
{
	String bookname;
	void show()
	{
		System.out.println(bookname);
	}
}
class Library extends Student
{
	String bookname="AA";
	void display()
	{
		super.bookname="Maths";
		System.out.println(super.bookname);
		System.out.println(bookname);
	}
}

public class Mulitlevel3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library o=new Library();
		o.display();
	}

}
