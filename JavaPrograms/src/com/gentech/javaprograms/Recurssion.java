package com.gentech.javaprograms;
class Maths
{
	public int getRecurssion(int num)
	{
		if(num==0 ||num==1)
		{
			return 1;
			
		}
		else
		{
			return num*getRecurssion(num-1);
		}
	}
}

public class Recurssion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maths o=new Maths();
		int val=o.getRecurssion(5);
		System.out.println(val);
	}

}
