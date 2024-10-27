package com.gentech.loops;

import java.util.Scanner;

public class Loopsdemo12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the tables number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=10;i>=1;i--)
		{
			System.out.println(num+"X"+i+"="+(num*i));
		}
		System.out.println("thank you");
	}
	

}
