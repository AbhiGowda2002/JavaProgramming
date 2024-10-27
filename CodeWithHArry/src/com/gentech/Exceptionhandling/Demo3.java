package com.gentech.Exceptionhandling;
class Maths3
{
	void addition(int x,int y)
	{
		try {
			int res=x+y;
			System.out.println("Addition result is "+res);
		}catch (ArithmeticException e)
		{
			e.printStackTrace();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maths3 o=new Maths3();
		o.addition(100, 17);
		
	}

}
