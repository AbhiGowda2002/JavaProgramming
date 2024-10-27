package com.gentech.staticmethods;
class Instance
{
	Instance()
	{
		System.out.println("It is a constructor");
	}
	static
	{
		System.out.println("it is a static block");
	}
	{
		System.out.println("it is a Instance block");
	}
}

public class InstanceDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instance o=new Instance();
		
	}

}
