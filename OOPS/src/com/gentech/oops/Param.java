package com.gentech.oops;
class Dem
{
	Dem(String name)
	{
		System.out.println(name);
	}
}
class Dem1 extends Dem
{
	Dem1()
	{
		super("Abhishek");
		System.out.println("GoodMorning");
	}
}

public class Param {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dem1 o=new Dem1();
		
	}

}
