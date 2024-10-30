package com.gentech.constructor;
class Product
{
	
	Product(String name)
	{
		System.out.println(name);
	}
	Product(double price)
	{
		System.out.println(price);
	}
	
	Product(char Type)
	{
		System.out.println(Type);
	}
	
}


public class Constructoroverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product obj1=new Product("SAMSUNG");
		Product obj2=new Product(20000);
		Product obj3=new Product('A');
	}

}
