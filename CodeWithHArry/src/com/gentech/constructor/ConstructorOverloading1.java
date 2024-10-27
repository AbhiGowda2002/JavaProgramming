package com.gentech.constructor;
class Animal
{
	Animal(String name,String type)
	{
		System.out.println(name);
		System.out.println(type);
	}
	Animal(int age,int id)
	{
		System.out.println(age);
		System.out.println(id);
	}
}

public class ConstructorOverloading1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal o1=new Animal("Tiger","Carnivorous");
		Animal o2=new Animal(12,201);
	}

}
