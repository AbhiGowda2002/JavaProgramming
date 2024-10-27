package com.gentech.Exceptionhandling;
class Prime
{
	public void checkprimenumber(int num)
	{
		boolean isprime=true;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				isprime=false;
			}
		}
		if(isprime==true)
		{
			System.out.println("It is a prime number");
		}
		else
		{
			System.out.println("It is not a prime number");
		}
	}
}
class fact
{
	public void getfactorial(int num)
	{    
		//num(n-1)
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}
}
class Count
{
	public void getcount(int num)
	{
		int sum=0;
		for(int i=0;i<=num;i++)
		{
			sum=sum+i;
		}
		System.out.println(sum);
	}
}
class Fibonacci
{
	public void getfibonacci(int num)
	{
		int a=1;
		int b=1;	
		System.out.print("1  1 ");
		for(int k=0;k<=num;k++)
		{
			k=a+b;
			System.out.print(k+" ");
			a=b;
			b=k;
		}
	}
}
class Even
{
	public void geteven(int num)
	{
		int sum=0;
		for(int i=1;i<=num;i++)
		{
			if(i%2==0)
			{
			 sum=sum+i;
			}	
		}
		System.out.println(sum);
}
}
class oddnumber
{
	public void getoddnumber(int num)
	{
		int sum=0;
		for(int i=1;i<=num;i++)
		{
			if(i%2!=0)
			{
				sum=sum+i;
			}
		}
		System.out.println(sum);
	}
}
class Multi
{
	public void getsumogmulti(int num)
	{
		 int sum=0;
		for(int i=1;i<=10;i++)
		{
			sum=sum+(num*i);
		}
		System.out.println(sum);
	}
}
public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prime o=new Prime();
		o.checkprimenumber(4);
		fact o1=new fact();
		o1.getfactorial(5);
		Count o2=new Count();
		o2.getcount(50);
		Fibonacci o3=new Fibonacci();
		o3.getfibonacci(50);
		Even o4=new Even();
		o4.geteven(50);
		oddnumber o5=new oddnumber();
		o5.getoddnumber(50);
		
		Multi o7=new Multi();
		o7.getsumogmulti(2);
	}

}
