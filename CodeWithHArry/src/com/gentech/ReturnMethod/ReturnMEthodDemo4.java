package com.gentech.ReturnMethod;
class Methods2
{
	int getsum(int a,int b)
	{
		int res=a+b;
		return res;
	}
	int getmultipilcation(int a,int b)
	{
		int res1=a*b;
		return res1;
	}
	int getdivision(int a,int b)
	{
		int res3=a/b;
		return res3;
	}
	int subtraction(int a,int b)
	{
		int res4=a-b;
		return res4;
	}
	boolean isprime(int num)
	{
		boolean prime=true;
		for(int i=2;i<=num;i++)
		{
			if(num%2==0)
			{
				prime=false;
				break;
			}
		}
		if(prime==true)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	int getsum(int num)
	{
	int sum=0;
	for(int i=1;i<=num;i++)
	{
		sum=sum+i;
	}
	return sum;
	}
	int sumofnumbers(int num)
	{
		int sum1=0;
		for(int i=1;i<=num;i++)
		{
			sum1=sum1+i;
		}
		return sum1;
	}
	String getname(String str)
	{
		return str;
	}
	String getcityname(String str)
	{
		return str;
	}
	
}

public class ReturnMEthodDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methods2 o=new Methods2();
		int v1=o.getsum( 15, 15);
		System.out.println("the result od sum is:" +v1);
		int v2=o.getmultipilcation(15,2);
		System.out.println("the result of multiplication is:"+v2);
		int v3=o.getdivision(15,3);
		System.out.println("the result of division is:"+v3);
		int v4=o.subtraction(10, 5);
		System.out.println("the subtraction reslut is:"+v4);
		boolean val=o.isprime(20);
		System.out.println("the given number is prime? " +val);
		int v5=o.getsum(50);
		System.out.println(v5);
		int v6=o.sumofnumbers(100);
		System.out.println(v6);
		String s=o.getname("Abhishek");
		System.out.println(s);
		String s1=o.getcityname("Bangalore");
		System.out.println(s1);
	}

}
