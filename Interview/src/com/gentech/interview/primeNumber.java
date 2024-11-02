package com.gentech.interview;
class prime
{
	boolean isprime(int num)
	{
		boolean prime=true;
		for(int i=2;i<num;i++)
		{
			if(i%num==0)
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
		
	}


public class primeNumber {

	public static void main(String[] args) {
		
		 prime o=new  prime();
		boolean num= o.isprime(20);
		System.out.println(num);
	}

}
