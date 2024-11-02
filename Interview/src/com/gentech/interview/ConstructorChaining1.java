package com.gentech.interview;
class College1
{
	College1(String name)
	{
		System.out.println(name);
	}
	
	College1()
	{
		this("Bangalore Institute of Technology");
		System.out.println("This is an Empty constructor");
	}
}

public class ConstructorChaining1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		College1 clg=new College1();
	}

}
