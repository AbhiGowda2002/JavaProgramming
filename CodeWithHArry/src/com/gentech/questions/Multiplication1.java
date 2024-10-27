package com.gentech.questions;
class Maths1
{
	void getmultiplication(int num)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(num+"X" + i +"=" +num*i);
		}
	}
	void getpatterns(int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<i+1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	int getsum(int num)
	{
		if(num==1)
		{
			return 1;
		}
		else
		{
			return num + getsum(num-1);
		}
	}
}

public class Multiplication1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maths1 o=new Maths1();
		o.getmultiplication(19);
		o.getpatterns(4);
		int v1=o.getsum(5);
		System.out.println(v1);
	}

}
