package com.gentech.methods;
class Maths
{
	void getaddition()
	{
		int a=10;int b=10;
		int c=a+b;
		System.out.println("Addition result is:"+c);
	}
	void getmultiplication()
	{
		int a,b;
		a=10;b=10;
		int res=a*b;
		System.out.println("multiplication result is "+res);
		
	}
}

public class MethodDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maths o=new Maths();
		o.getaddition();
		o.getmultiplication();
		
	}

}
