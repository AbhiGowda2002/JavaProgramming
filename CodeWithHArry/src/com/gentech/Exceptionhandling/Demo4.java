package com.gentech.Exceptionhandling;
class Maths4
{
	public void getmultiplication(int x,int y)
	{
		try
		{
			int res=x*y;
			System.out.println("the multipication result is :"+res);
		}catch(Exception e)
		{
			e.printStackTrace();
		}finally
		{
			System.out.println("The division Method has Executed");
		}
	}
}

public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maths4 o=new Maths4();
		o.getmultiplication(20, 20);
	}

}
