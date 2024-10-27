package com.gentech.methods;
class Maths1
{
	void addition()
	{
		int a,b,res;
		a=10;b=20;
		res=(a+b)/2;
		System.out.println(res);
	}
	void subtraction()
	{
		int a,b,res;
		a=10;b=20;
		res=(a-b);
		System.out.println(res);
	}
	void multiplication()
	{

		int a,b,res;
		a=10;b=20;
		res=a*b;
		System.out.println(res);
	}
}

public class MethodsDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maths1 o=new Maths1();
		o.addition();
		o.subtraction();
		o.multiplication();
	}

}
