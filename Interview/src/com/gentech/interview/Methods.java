package com.gentech.interview;
class Maths
{
	public void getaddition(int a,int b)
	{
		int res;
		res=a+b;
		System.out.println("The addithon result is :"+res);
	}
	public void getmultiplication (int a,int b)
	{
		int res =a*b;
		System.out.println("The Multiplication res is :"+res);
	}
	public void getSubtraction(int a,int b)
	{
		int res=a-b;
		System.out.println("The Subtraction result is :"+res);
	}
			
}

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maths o=new Maths();
		o.getaddition(22, 22);
		o.getmultiplication(10, 2);
		o.getSubtraction(20, 10);
		
	}

}
