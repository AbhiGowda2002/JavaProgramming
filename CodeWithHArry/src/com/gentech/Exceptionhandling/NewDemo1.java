package com.gentech.Exceptionhandling;
class work
{
	public void division(int x,int y)
	{
		try
		{
			int res=x/y;
			System.out.println(res);
		}catch (Exception e)
		{
			e.printStackTrace();
			System.out.println(e);
		}
	}
}
	

public class NewDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		work o=new work();
		o.division(45, 3);
	  
	}

}
