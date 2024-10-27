package com.gentech.questions;
class Employee
{
	String name;
	int age;
	Employee()
	{
		name="Abhishek";
		age=22;
		System.out.println(name);
		System.out.println(age);
	}
}
class product
{
	String name;
	int price;
	product()
	{
		name="mobile";
		price=20000;
		System.out.println(name);
		System.out.println(price);
	}
}

public class ConstructorDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee o1=new Employee();
		product o2=new product();
		
	}

}
