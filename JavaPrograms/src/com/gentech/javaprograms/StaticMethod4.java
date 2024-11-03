package com.gentech.javaprograms;
class Abhishek
{
	static String name;
	static int age ;
	
	static 
	{
		name="Abhishek";
		age=19;
	}
	public static void getname(String name)
	{
		System.out.println(name);
	}
	public static void getage(int age)
	{
		System.out.println(age);
	}
}

public class StaticMethod4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=Abhishek.name="Abhsihek";
		System.out.println(str);
		int a=Abhishek.age=22;
		System.out.println(a);
		System.out.println("--------");
		Abhishek.getname("varun");
		Abhishek.getage(22);
		
	}

}
