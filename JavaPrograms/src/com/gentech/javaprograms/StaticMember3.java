package com.gentech.javaprograms;
class Family
{
	static String name;
	static int age;
	
	static
	{
		name="Abhishek";
		age=22;
	}
	static void showname()
	{
		System.out.println(name);
	}
	static void showage()
	{
		System.out.println(age);
	}
	
}

public class StaticMember3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Family.showname();
		Family.showage();
		Family.showname();
	}

}
