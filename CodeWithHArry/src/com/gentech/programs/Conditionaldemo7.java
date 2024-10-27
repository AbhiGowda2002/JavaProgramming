package com.gentech.programs;

import java.util.Scanner;

public class Conditionaldemo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the colour");
		Scanner sc=new Scanner(System.in);
		String s1 =sc.next();
		String s2=sc.next();
		String s3=sc.next();
		if(s1.equals("red"))
		{
			System.out.println("You need to stop");
		}
		else if(s2=="green")
		{
			System.out.println("You need to go");
		}
		else if(s3=="orange")
		{
			System.out.println("you need to get ready");
		}
		
	}

}
