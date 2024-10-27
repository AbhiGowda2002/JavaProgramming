package com.gentech.ReturnMethod;
class Demo
{
	int getfactorial(int num)
	{
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
	int getmultiplication(int x,int y)
	{
		int res=x*y;
		return res;
	}
	
}

public class Return1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo o=new Demo();
		int v1=o.getfactorial(5);
		System.out.println(v1);
		int v2=o.getmultiplication(10, 10);
		System.out.println(v2);
	}

}
