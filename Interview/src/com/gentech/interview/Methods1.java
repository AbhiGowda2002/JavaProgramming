package com.gentech.interview;
class Maths2
{
	public int getaddition(int a,int b)
	{
		int res=a+b;
		return res;
	}
	public int getsubtraction(int a,int b)
	{
		int res1=a-b;
		return res1;
	}
	public void getmultiplication(int x ,int y)
	{
		int res2=x*y;
		System.out.println(res2);
		
	}
}

public class Methods1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maths2 o=new Maths2();
		int v1=o.getaddition(10, 10);
		System.out.println(v1);
		
		System.out.println("---------------");
		
		int v2=o.getsubtraction(20, 10);
		System.out.println(v2);
		
		System.out.println("---------------");
		
		o.getmultiplication(o.getaddition(v1, v2), o.getsubtraction(v1, v2));
		
	}

}
