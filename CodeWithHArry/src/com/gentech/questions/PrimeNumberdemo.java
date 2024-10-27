package com.gentech.questions;

import java.util.Scanner;

public class PrimeNumberdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the number");
		Scanner sc =new Scanner(System.in);
		int num=sc.nextInt();
		
		int flag=0;
		for(int i=2;i<num;i++)
		{
			if (num%i==0)
			{
				flag=flag+1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println(num+" is a prime number");
		}
		else {
			System.out.println(num+" is not a prime number");
		}
		
	}

}
