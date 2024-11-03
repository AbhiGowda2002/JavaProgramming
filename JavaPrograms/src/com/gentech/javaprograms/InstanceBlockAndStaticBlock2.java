package com.gentech.javaprograms;
class Demo2
{
	Demo2(int age)
	{
		System.out.println(age);
	}
	
	public void getaddition(int x,int y)
	{
		int res=x+y;
		System.out.println(res);
	}
	static
	{
		System.out.println("This is an static block");
	}
	{
		System.out.println("This is an instance block");
	}
}

public class InstanceBlockAndStaticBlock2 {

	public static void main(String[] args) {
		Demo2 o=new Demo2(22);
		o.getaddition(10, 10);

	}

}
