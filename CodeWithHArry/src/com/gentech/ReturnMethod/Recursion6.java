package com.gentech.ReturnMethod;
class Recursion1
{
	void getnumbers(int num)
	{
		if(num<=20)
		{
			System.out.println(num);
			num=num+1;
			getnumbers(num);
		}
	}
}

public class Recursion6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Recursion1 o=new Recursion1();
		o.getnumbers(0);
	}

}
