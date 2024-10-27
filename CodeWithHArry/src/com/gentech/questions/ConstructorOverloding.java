package com.gentech.questions;
class Human1
{
	Human1(String name)
	{
		System.out.println(name);
	}
	Human1(int age)
	{
		System.out.println(age);
	}
}

public class ConstructorOverloding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human1 o1=new Human1("Abhishek");
		Human1 o2=new Human1(22);
		
	}

}
