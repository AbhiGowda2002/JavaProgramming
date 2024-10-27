package com.gentech.programs;

import java.util.Scanner;

public class Conditionaldemo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the numbers x and y");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		if(x>y)
		{
			System.out.println(x+ "is grater than"+y);
		}
		else 
		{
			System.out.println(y+ "is grater than"+x);
		}
	}

}
