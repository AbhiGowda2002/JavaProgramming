package com.gentech.Exceptionhandling;
class Demo6
{
	void getdivision(int x,int y)
	{
		try
		{
			int res=x/y;
			System.out.println(res);
		}finally 
		{
			System.out.println("it is executed");
		}
	}
}

public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo6 o=new Demo6();
		o.getdivision(15, 3);
	}

}
