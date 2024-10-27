package com.gentech.ReturnMethod;
class Ddemo1
{
	void getprime(int num)
	{
		if(num==2)
		{
			System.out.println("It is a prime number");
			return;
		}
		boolean isprime=true;
		for(int i=2;i<=num;i++)
		{
			if(num%i==0)
			{
				isprime=false;
			}
		}
		if(isprime==true)
		{
			System.out.println("it is a prime number");
		}
		else
		{
			System.out.println("it is not a prime number");
		}
	}
}
public class Recursion4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ddemo1 o=new Ddemo1();
		o.getprime(3);
	}

}
