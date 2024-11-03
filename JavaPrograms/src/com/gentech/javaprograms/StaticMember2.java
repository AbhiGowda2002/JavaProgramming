package com.gentech.javaprograms;
class Vidya
{
	static String name;
	static int age;
	
	public static void getmultiplication(int x,int y)
	{
		int res=x*y;
		System.out.println("The Multiplication result is:"+res);
	}
}

public class StaticMember2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=Vidya.age=19;
		System.out.println("The age is :"+a);
		String str=Vidya.name="Vidyadhari";
		System.out.println("The Name is :"+str);
		
		Vidya.getmultiplication(10, 10);
	}

}
