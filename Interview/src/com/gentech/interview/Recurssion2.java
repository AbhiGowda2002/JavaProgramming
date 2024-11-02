package com.gentech.interview;
class fact
{
	public int getfactorial(int num)
	{
		if(num==0 || num==1)
		{
			return num;
		}
		else 
		{
			return num*getfactorial( num-1);
		}
	}
}

public class Recurssion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fact o=new fact();
		int val=o.getfactorial(6);
		System.out.println(val);
	}

}
