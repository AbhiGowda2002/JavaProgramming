package com.gentech.ReturnMethod;
class Maths22
{
	void addition(int x,int y)
	{
		int res1=x=y;
		System.out.println(res1);
	}
	void addition(int x,int y,int z)
	{
		int res2=x=y=z;
		System.out.println(res2);
	}
	void addition (float x,float y)
	{
		float res3=x+y;
		System.out.println(res3);
	}
	void addition(int a[])
	{
		int res4=0;
		for(int i=0;i<a.length;i++)
		{
			res4=res4+a[i];
		}
		System.out.println(res4);
	}
}

public class MethodOverloadingDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maths22 o=new Maths22();
		o.addition(10,10);
		o.addition(10,10,10);
		o.addition(25.54f,30.44f);
		int res[]= {20,30,40,50,60};
		o.addition(res);
	}

}
