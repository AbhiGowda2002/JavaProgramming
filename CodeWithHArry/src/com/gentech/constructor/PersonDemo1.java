package com.gentech.constructor;

public class PersonDemo1 {
	String name;
	int age;

	public static void main(String[] args) {
             // how to create a object 
		PersonDemo1 o=new PersonDemo1();
		o.name="abhishek";
		o.age=22;
		System.out.println("Name:"+o.name);
		System.out.println("Age:"+o.age);
		PersonDemo1 obj=new PersonDemo1();
		obj.name="Abhishek";
		obj.age=23;
		System.out.println("Name:"+obj.name);
		System.out.println("Age"+obj.age);

	}

}
