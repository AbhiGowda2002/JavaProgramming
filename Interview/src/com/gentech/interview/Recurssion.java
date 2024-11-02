package com.gentech.interview;
class recurssions
{
	void getrecursion(int num)
	{
		if(num<=20)
		{
			System.out.println(num);
			num=num+1;
			getrecursion(num);
		}
	}
}

public class Recurssion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		recurssions o=new recurssions();
		o.getrecursion(15);
	}

}
