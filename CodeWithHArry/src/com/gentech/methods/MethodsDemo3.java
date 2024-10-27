package com.gentech.methods;
class logic
{
	void addition()
	{

		int a,b,res;
		a=10;b=20;
		res=a=b;
		System.out.println(res);
	}
	void subtraction()
	{

		int a,b,res;
		a=10;b=20;
		res=a-b;
		System.out.println(res);
	}
}

public class MethodsDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		logic o=new logic();
		o.addition();
		o.subtraction();
	}

}
