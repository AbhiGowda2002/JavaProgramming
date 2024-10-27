package com.gentech.constructor;

public class Person {
	String Firstname;
	int age;

	public static void main(String[] args) {
		Person obj=new Person();
		obj.Firstname="Abhishek";
		obj.age=22;
		System.out.println("firstnameis:"+obj.Firstname);
		System.err.println("Age:"+obj.age);
		Person obj1=new Person();
		obj1.Firstname="Akshay";
		obj1.age=33;
		System.out.println(obj1.Firstname);
		System.out.println(obj1.age);
	}

}
