package com.gentech.constructor;
class Product22
{
	String name;
	int price;
	Product22()
	{
		name="laptop";
		price=22000;
		System.out.println(name);
		System.out.println(price);
	}
}
class Product33
{
	String name;
	int price;
	Product33()
	{
		name="MobilePhone";
		price=25000;
		System.out.println(name);
		System.out.println(price);
	}
}
public class ConstructorDmo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product22 o=new Product22();
		Product33 o1=new Product33();
		
	}

}
