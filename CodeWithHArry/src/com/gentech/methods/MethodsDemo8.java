package com.gentech.methods;
class Array1
{
	void ReadFirstHalf()
	{
		int num[]= {10,20,30,40,50,60};
		for(int i=0;i<num.length/2;i++)
		{
			System.out.println(num[i]);
		}
	}
}

public class MethodsDemo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array1 o=new Array1();
		o.ReadFirstHalf();
		
	}

}
