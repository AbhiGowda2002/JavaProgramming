package com.gentech.interview;
class Method
{
	public int getaddition(int a,int b)
	{
		int res=a+b;
		return res;
	}
	public int  getsubtraction(int a,int b)
	{
		int res=a-b;
		return res;
		
	}
	public void getmultiplication()
	{
		int a=this.getaddition(10, 10);
		int b=this.getsubtraction(20,10);
		int result=a*b;
		System.out.println(result);
	}
}

public class Methods2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method o=new Method();
		int val1=o.getaddition(10, 10);
		System.out.println(val1);
		
		int val2=o.getsubtraction(20, 10);
		System.out.println(val2);
		
		
		o.getmultiplication();
	}

}
