package com.gentech.Exceptionhandling;
class Maths1
{
	void getaddition(int x,int y)
	{
		try
		{
			int res=x+y;
			System.out.println("The Addition result is :"+res);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maths1 o=new Maths1();
		o.getaddition(10,27);
	}

}
