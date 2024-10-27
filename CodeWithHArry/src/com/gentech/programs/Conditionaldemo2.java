package com.gentech.programs;

import java.util.Scanner;

public class Conditionaldemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter yor age");
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		if(age>=18)
		{
			System.out.println("Elegible for Voting");
		}
		else
		{
			System.out.println("Sorry not elegible for voting");
		}
	}

}
