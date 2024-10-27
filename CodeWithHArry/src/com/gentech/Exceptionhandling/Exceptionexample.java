package com.gentech.Exceptionhandling;
class Exceptionn
{
	static void Elegibleforvoiting(int age)throws Exception
	{
		if(age<18)
		{
			throw new Exception("Age sholud be greater than 18");
		}
		else
		{
			System.out.println("Eligible for voting");
		}
	}
}


public class Exceptionexample {

	public static void main(String[] args) {
		try
		{
			Exceptionn.Elegibleforvoiting(16);
			
		}catch(Exception e)
		{
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		try
		{
			Exceptionn.Elegibleforvoiting(20);
			
		}catch(Exception e)
		{
			e.printStackTrace();
			System.out.println(e.getMessage());
		
	}
	}
}