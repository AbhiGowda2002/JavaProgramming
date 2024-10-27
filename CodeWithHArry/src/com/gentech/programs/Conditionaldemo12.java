package com.gentech.programs;

import java.util.Scanner;

public class Conditionaldemo12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num%2==0)
		{
			System.out.println("the Entered number is Even");
		}
		else 
		{
			System.out.println("the Entered number is odd");
		}
		
		
	}

}
