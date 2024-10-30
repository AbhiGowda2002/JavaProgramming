package com.gentech.constructor;
class Human2

{	
	String Firstname;
	int Age;
	Human2(String name,int age)
	{
		Firstname=name;
		Age=age;
		System.out.println("firstname:"+name);
		System.out.println("Age:"+age);
		
	}
	
}
public class parameterizedconstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human2 obj1=new Human2("santosh",35);
		Human2 obj2=new Human2("Abhishek",22);
		Human2 obj3=new Human2("abhishek",88);
		
	}

}
