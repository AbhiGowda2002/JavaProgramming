package com.gentech.interview;
class Bubly
{
	void getrecurssion(int num)
	{
		if(num<=20)
		{
			System.out.println(num);
			num=num+1;
			getrecurssion(num);
		}
	}
}

public class Recurssion1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bubly o=new Bubly();
		o.getrecurssion(1);
	}

}
