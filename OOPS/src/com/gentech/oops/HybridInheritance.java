package com.gentech.oops;
class Demoo1
{
	public  void getaddition(int x,int y)
	{
		int res=x+y;
		System.out.println(res);
	}
}
class Demoo2 extends Demoo1
{
	public void getsubtraction(int x,int y)
	{
		int res=x-y;
		System.out.println(res);
	}
}
class Demoo3 extends Demoo1
{
	public void getdivision(int a,int b)
	{
		int res=a/b;
		System.out.println(res);
	}
}
class Demoo4 extends Demoo3
{
	public void getsquare(int x)
	{
		int res=x*x;
		System.out.println(res);
	}
}

public class HybridInheritance {

	public static void main(String[] args) {
		Demoo2 o=new Demoo2();
		o.getaddition(10, 10);
		o.getsubtraction(10, 10);
		
		Demoo4 o1=new Demoo4();
		o1.getdivision(10, 2);
		o1.getsquare(9);

	}

}
