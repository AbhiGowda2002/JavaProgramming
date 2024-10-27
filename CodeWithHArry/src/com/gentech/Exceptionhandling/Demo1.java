package com.gentech.Exceptionhandling;
class Maths
{
	static void division(int x,int y)
	{
		try
		{
			int res=x/y;
			System.out.println("Div result is"+res);
		}catch (ArithmeticException  e)
		{
			e.printStackTrace();
			
		}
	}
}

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maths o=new Maths();
		o.division(20, 5);
	}

}
