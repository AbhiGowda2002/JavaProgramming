package com.gentech.ReturnMethod;
class calculation
{
	int addition(int x,int y)
	{
		int res1=x+y;
		return res1;
	}
	int subtraction (int x,int y)
	{
		int res2=x-y;
		return res2;
	}
	void multiplication()
	{
		int x=this.addition(10, 20);
		int y=this.subtraction(20, 10);
		int res=x*y;
		System.out.println(res);
	}
}
public class ReturnValueDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculation o=new calculation();
		int v1=o.addition(10, 10);
		System.out.println(v1);
		int v2=o.subtraction(20, 10);
		System.out.println(v2);
		o.multiplication();
	}

}
