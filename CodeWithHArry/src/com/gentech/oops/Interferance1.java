package com.gentech.oops;
class Maths1
{
	void addition(int x,int y)
	{
		int result=x+y;
		System.out.println(result);
	}
}
class Maths2 extends Maths1
{
	void multiplication(int x ,int y)
	{
		int res=x*y;
		System.out.println(res);
	}
}

public class Interferance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maths2 o=new Maths2();
		o.addition(20, 20);
		o.multiplication(10, 10);
	}

}
