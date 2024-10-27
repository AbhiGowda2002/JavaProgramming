package com.gentech.programs;

import java.util.Scanner;

public class Conditionaldemo13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		if(num>0)
		{
			System.out.println("The number is Positive");
		}
		else if (num<0)
		{
			System.out.println("the number is negative");
			
		}
	}

}
