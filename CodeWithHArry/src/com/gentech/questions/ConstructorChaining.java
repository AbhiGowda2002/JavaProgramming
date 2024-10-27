package com.gentech.questions;
class product1
{
	product1(String name)
	{
		System.out.println(name);
	}
	product1(int price)
	{
		this("Laptop");
		System.out.println(price);
		
	}
}

public class ConstructorChaining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		product1 o1=new product1(25000);
		
	}

}
