package com.gentech.constructor;
class Busses
{
	Busses(String name,int id)
	{
		System.out.println(name);
	}
	Busses(String type,double price)
	{
		this("Ashwamegha",201);
		System.out.println(type);
		System.out.println(price);
	}
}

public class ConstructorOverloading2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Busses o1=new Busses("Service bus",200000.22);
		
	}

}
