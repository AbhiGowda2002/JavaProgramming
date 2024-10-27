package com.gentech.staticmethods;
class Demo2
{
	Demo2()
	{
		System.out.println("It is a Constructor");
	}
	static 
	{
		System.out.println("It is a static block");
	}
}

public class StaticDemo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo2 o=new Demo2();
		
	}

}
