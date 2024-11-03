package com.gentech.javaprograms;
class Person
{
	static String name;
	static int age;
}

public class StaticVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person o=new Person();
		String s=o.name="Abhishek";
		System.out.println(s);
		int s1=o.age=22;
		System.out.println(s1);
	}

}
