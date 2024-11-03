package com.gentech.javaprograms;
class Outter
{
	String name;
	inner inn=new inner();
	void showage()
	{
		inn.age=18;
		System.out.println(inn.age);
	}
class inner
{
	int age;
	void showname()
	{
		int age=18;
		name="Abhishek";
		System.out.println(name);
	}
}
}
public class OuterAndInnerClass {

	public static void main(String[] args) {
	Outter out=new Outter();
	out.showage();
	out.inn.showname();
	
	}

}
