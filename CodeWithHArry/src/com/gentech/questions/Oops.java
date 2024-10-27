package com.gentech.questions;
class Mathss
{
	Mathss(int marks1,int marks2)
	{
		int sum=marks1+marks2;
		System.out.println("The sum of the marks is "+sum);
	}
}
class Maths2 extends Mathss
{
	int Maths3;
	Maths2()
	{
		super(20, 20);
		Maths3=45;
		System.out.println("the result of maths3 is:"+Maths3);
	}	
}

public class Oops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maths2 o=new Maths2();
		
	}

}
