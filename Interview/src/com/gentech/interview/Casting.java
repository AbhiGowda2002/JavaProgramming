package com.gentech.interview;
class Abhii
{
	public void getaddition(int a,int b)
	{
		int res=a+b;
		System.out.println("The result of the addition is :"+res);
	}
}
class vidya 
{
	public int getsubtraction(int a,int b)
	{
		int res=a-b;
		return res;
	}
}

public class Casting {

	public static void main(String[] args) {
		
		Abhii o=new Abhii();
		o.getaddition(30, 20);
		
		vidya  o1=new vidya ();
		int res=o1.getsubtraction(20, 10);
		System.out.println("The result of the Subtraction is :"+res);
		
	}

}
