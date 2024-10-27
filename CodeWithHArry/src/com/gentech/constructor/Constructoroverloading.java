package com.gentech.constructor;
class product5
{
	product5(String name)
	{
		System.out.println(name);
	}
	product5(int price)
	{
		System.out.println(price);
	}
}

public class Constructoroverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		product5 o1=new product5("Samsung laptop");
		product5 o2=new product5(2500);
		

	}

}
