package com.gentech.oops;
class Maths7
{
	void Addition(int x,int y)
	{
		int res1=x+y;
		System.out.println(res1);
	}
}
class Maths8 extends Maths7
{
	void division(int a,int b)
	{
		int res2=a/b;
		System.out.println(res2);
	}
}
class Maths9 extends Maths8
{
	void multiplication(int a,int b)
	{
		int res3=a*b;
		System.out.println(res3);
	}
}

public class MultiLevelInterferance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maths9 o=new Maths9();
		
		o.Addition(10, 20);
		o.division(10, 5);
		o.multiplication(10, 10);
	}

}
