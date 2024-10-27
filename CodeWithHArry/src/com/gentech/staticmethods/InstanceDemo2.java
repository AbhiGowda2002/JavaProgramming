package com.gentech.staticmethods;
class Demo4
{
	Demo4()
	{
		System.out.println("it is a constructor");
	} 
	{
		System.out.println("It is a instance block");
	}
}
class Demo5
{
	{
		System.out.println("it is a Instance block 1");
	}
	{
		System.out.println("it is a Instance block 2");
	}
	{
		System.out.println("it is a Instance block 3");
	}
}


public class InstanceDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo4 o=new Demo4();
		System.out.println("--------------");
		Demo5 o1=new Demo5();
	}

}
