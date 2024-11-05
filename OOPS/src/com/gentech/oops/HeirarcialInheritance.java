package com.gentech.oops;
class Demo1
{
	public void getaddition(int x,int y)
	{
		int res=x+y;
		System.out.println(res);
	}
}
class Demo2 extends Demo1
{
	public void getsubtraction(int x,int y)
	{
		int res=x-y;
		System.out.println(res);
	}
}
class Demo3 extends Demo1
{
	public void getdivision(int a,int b)
	{
		int res=a/b;
		System.out.println(res);
	}
}

public class HeirarcialInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo3 o=new Demo3();
		o.getaddition(10, 10);
		o.getdivision(10, 2);
		
		Demo2 o1=new Demo2();
		o1.getsubtraction(10, 10);
	}

}
