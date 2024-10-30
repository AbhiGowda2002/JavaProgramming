package com.gentech.constructor;
class Maths
{
	void factorial()
	{
		int fact=1;
		int num=5;
		for(int i=1;i<=5;i++)
		{
			fact = fact*i;
		}
			System.out.println("The factorial of the given number is:"+fact);
	}
	void addition()
	{
		int x,y,sum;
		x=20;y=20;
		sum=x+y;
		System.out.println("The Addition result is:"+sum);
	}
}


public class Methodsdemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maths obj=new Maths();
		obj.factorial();
		obj.addition();
	}

}
