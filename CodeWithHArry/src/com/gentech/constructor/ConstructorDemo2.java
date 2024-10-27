package com.gentech.constructor;
class Human
{
	String name;
	int age;
}
class Product
{
	String productname;
	int price;
}
class Birds
{
	String name;
	int nooffeathers;
}

public class ConstructorDemo2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human obj=new Human();
		obj.name="Abhishek";
		obj.age=22;
		System.out.println("Name of human:"+obj.name);
		System.out.println("age of human:"+obj.age);
		
		Product obj1=new Product();
		obj1.productname="Laptop";
		obj1.price=3500;
		System.out.println("Product name:"+obj1.productname);
		System.out.println("Product price:"+obj1.price);
		
		Birds obj2=new Birds();
		obj2.name="kingfisher";
		obj2.nooffeathers=50;
		System.out.println("No of feathers:"+obj2.nooffeathers);
		System.out.println("Birdname is:"+obj2.name);
		
		
		
	}

}
