package com.gentech.constructor;
class Human3
{
	String name;
	int age;
	Human3()
	{
		name="Abhishek";
		age=22;
		System.out.println("Name :" +name);
		System.out.println("age is:"+age);
	}
}
class product1
{
	String productname;
	int price;
	product1()
	{
		productname="Samsung";
		price=30000;
		System.out.println("product name :"+productname);
		System.out.println("price :"+price);
	}
}
class Human4
{
	String name;
	int age;
	Human4()
	{
		name="Anush";
		age=23;
		System.out.println("Name is"+name);
		System.out.println("age is:"+age);
	}
}

public class ConstructorDemo4 {

	public static void main(String[] args) {
		Human3 obj=new Human3();
		product1 obj1=new product1();
		Human4 obj2=new Human4();

	}

}
