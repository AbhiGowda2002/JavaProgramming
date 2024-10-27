package com.gentech.programs;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean istrue=true;
		boolean isfalse=false;
		System.out.println("Enter the Number");
		Scanner sc=new Scanner(System.in);
		System.out.println(sc.hasNextInt());
		if(istrue)
		{
			System.out.println("it is an integer");
		}
		else
		{
			System.out.println("it is not an integer");
		}
	}

}
