package com.gentech.ReturnMethod;
class demoo
{
	void recursion(int num)
	{
		
		if(num<=20)
		{
			System.out.println(num);
			num=num+1;
			recursion(num);
		}
	}
	void getnumbers(int num1)
	{
		if(num1<=100)
		{
			System.out.println(num1);
			num1=num1+1;
			getnumbers(num1);
		}
	}
}

public class RecursionDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demoo o=new demoo();
		o.recursion(0);
		System.out.println("+++++++++++");
		o.getnumbers(1);
	}

}
