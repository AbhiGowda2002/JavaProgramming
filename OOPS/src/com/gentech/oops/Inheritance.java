package com.gentech.oops;
class Greater
{
	public  void getaddition(int x,int y)
	{
		int res=x+y;
		System.out.println(res);
	}
}
class Lower extends Greater
{
	public  void getmultiplication(int a,int b)
	{
		int res=a*b;
		System.out.println(res);
	}
}
public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lower low=new Lower();
		low.getaddition(10, 10);
		
		low.getmultiplication(10, 10);
	}

}
