package com.gentech.ReturnMethod;
class ClallByValue
{
	  void Calculate(int x,int y)
	{
		x*=100;
		y*=9;
		System.out.println(x);
		System.out.println(y);
	}
}

public class CallByValue {

	public  static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ClallByValue o=new ClallByValue();
		o.Calculate(10, 10);
		
	}

}
