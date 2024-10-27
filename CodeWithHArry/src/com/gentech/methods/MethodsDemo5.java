package com.gentech.methods;
class logic2
{
	void getaddition(int x,int y)
	{
		int result=x+y;
		System.out.println(result);
	}
	void getmultiplication(int a,int b)
	{
		int res=a*b;
		System.out.println(res);
	}
}

public class MethodsDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		logic2 o1=new logic2();
		o1.getaddition(21, 21);
		o1.getmultiplication(5, 5);

	}

}
