package com.gentech.practice2;
class Animal
{
	String Animalname;
	String Animaltype;
	int age;
	Animal(String animalname,String animaltype,int Age)
	{
		Animalname=animalname;
		Animaltype=animaltype;
		age=Age;
		System.out.println(animalname);
		System.out.println(animaltype);
		System.out.println(Age);
		System.out.println("------------");
		
	}
}

public class Parameterizedconstructordemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal o=new Animal("Tiger","Carinvorus",22);
	}

}
