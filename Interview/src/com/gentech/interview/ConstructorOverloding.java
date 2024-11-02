package com.gentech.interview;
class School
{
	School(int years)
	{
		System.out.println(years);
	}
	School(String name,int age)
	{
		System.out.println(name);
		System.out.println(age);
	}
	School(int Contact,String Aluminy)
	{
		System.out.println(Contact);
		System.out.println(Aluminy);
	}
}

public class ConstructorOverloding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		School o=new School(200);
		School o1=new School("VSS",100);
		School o2=new School("Abhishek",998021);

	}

}
