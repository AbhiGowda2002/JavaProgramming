package com.gentech.oops;
class Maths
{
	public void getaddition(int x,int y)
	{
		int res=x+y;
		System.out.println(res);
	}
}
class Maths1 extends Maths
{
	public void getsubtraction(int x,int y)
	{
		int res=x-y;
		System.out.println(res);
	}
}
class Maths2 extends Maths1
{
	public void getdivision(int a,int b)
	{
		int res=a/b;
		System.out.println(res);
	}
}

public class MultilevelInheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maths2 mat=new Maths2();
		mat.getaddition(10, 10);
		mat.getsubtraction(10, 10);
		mat.getdivision(10, 2);
				
	}

}
