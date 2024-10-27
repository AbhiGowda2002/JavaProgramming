package com.gentech.questions;
class Human
{
	String name;
	int age;
	Human(String name,int age)
	{
		name=name;
		age=age;
		System.out.println(name);
		System.out.println(age);
	}
}
class Animal
{
	String name;
	String type;
	Animal(String name,String type)
	{
		name=name;
		type=type;
		System.out.println(name);
		System.out.println(type);
	}
}
public class ConstructorDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human o1=new Human("Abhishek",22);
		Animal o2=new Animal("Tiger","carnivorous");
	}

}
