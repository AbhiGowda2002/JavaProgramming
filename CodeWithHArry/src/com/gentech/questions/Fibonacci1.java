package com.gentech.questions;

import java.util.Scanner;

public class Fibonacci1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the value of n");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=1,b=1,k;
		k=0;
		System.out.print("1 1 ");
		for(k=0;k<=n;k++)
		{
			k=a+b;
			System.out.print(k+" ");
			a=b;
			b=k;
		}

	}

}
