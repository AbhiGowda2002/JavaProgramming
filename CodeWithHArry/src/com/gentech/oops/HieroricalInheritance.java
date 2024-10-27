package com.gentech.oops;
class Human1
{
	public void Addition(int x, int y)
	{
		int res1=x+y;
		System.out.println(res1);
	}
}
class Human2 extends Human1
{
	public void subtraction(int x,int y)
	{
		int res2=x-y;
		System.out.println(res2);
	}
}
class Human3 extends Human1
{
	public void multiplication(int x,int y)
	{
		int res3=x*y;
		System.out.println(res3);
	}
}

public class HieroricalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human2 o1=new Human2();
		o1.Addition(10, 10);
		o1.subtraction(10, 10);
		
		Human3 o2=new Human3();
		o2.Addition(5, 10);
		o2.multiplication(10, 10);
	}

}
