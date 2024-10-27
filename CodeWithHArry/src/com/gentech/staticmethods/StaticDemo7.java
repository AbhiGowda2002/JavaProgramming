package com.gentech.staticmethods;
class demo1
{
	static String name;
	static 
	{
		name="Abhishek";
		System.out.println(name);
		System.out.println("It is a static block");
	}
}

public class StaticDemo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo1 o=new demo1();
		
	}

}
