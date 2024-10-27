package com.gentech.programs;

import java.util.Scanner;

public class Conditionaldemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter yor age");
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		if(age>=18)
		{
			System.out.println("Eligible for Voting");		
		}
		else
		{
			System.out.println("Sorry not elegible for voting");
		}
	}

}
