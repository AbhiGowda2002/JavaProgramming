package com.gentech.methods;
class Array2
{
	void ReadSecondHalf()
	{
		int num[]= {10,20,30,40,50,60,70};
		for(int i=num.length/2;i<num.length;i++)
		{
			System.out.println(num[i]);
		}
	}
}

public class MethodsDemo9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array2 o=new Array2();
		o.ReadSecondHalf();
	}

}
