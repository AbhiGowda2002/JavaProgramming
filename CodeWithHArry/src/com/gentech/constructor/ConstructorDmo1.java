package com.gentech.constructor;
class packages
{	
	String name;
	int age;
	packages(String name,int age)
	{
		name=name;
		age=age;
		System.out.println(name);
		System.out.println(age);
	}
}

public class ConstructorDmo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		packages o=new packages("Abhishek",22);
	}

}
