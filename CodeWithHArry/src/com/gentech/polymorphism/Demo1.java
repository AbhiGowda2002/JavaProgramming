package com.gentech.polymorphism;
class Animals
{
	void makesound()
	{
		System.out.println("Yes Animals make sound:");
	}
}
class Dog extends Animals 
{
	void makesound()
	{
		System.out.println("Dogbarks");
	}
}
class Cat extends Animals
{
	void makesound()
	{
		System.out.println("Cat Meaws");
	}
}
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animals ani=new Animals();
		Dog dog=new Dog();
		Cat cat=new Cat();
		
		ani=dog;
		ani.makesound();
		
		ani=cat;
		ani.makesound();
		
	}

}
