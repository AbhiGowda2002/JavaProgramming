package com.gentech.javaprograms;
class Demo1
{
	Demo1(String name)
	{
		System.out.println(name);
	}
	{
		System.out.println("This is an simple Instance Block");
	}
}

public class InstanceBlockAndStaticBlock1 {

	public static void main(String[] args) {
		Demo1 o=new Demo1("Abhishek");
	}

}
