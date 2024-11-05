package com.gentech.oops;
class Animal
{
	public void sound()
	{
		System.out.println("Makes Sounds");
	}
}
class Dog extends Animal
{
	public void sound()
	{
		System.out.println("Dog Barks");
	}
}
class Cat extends Animal
{
	public void sound()
	{
		System.out.println("cat Meows");
	}
}
class Lion extends Animal
{
	public void sound()
	{
		System.out.println("Lion Roars");
	}
}
public class Polymorphism2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal=new Animal();
		Dog dog=new Dog();
		Cat cat=new Cat();
		Lion lion=new Lion();
		
		animal=dog;
		animal.sound();
		
		animal=cat;
		animal.sound();
		
		animal=lion;
		animal.sound();
		
	}

}
