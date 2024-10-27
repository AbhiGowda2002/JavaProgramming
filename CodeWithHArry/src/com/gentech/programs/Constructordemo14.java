package com.gentech.programs;

import java.util.Scanner;

public class Constructordemo14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if (num<99)
		{
			System.out.println("the number is two degits");
		}
		else if (num<999)
		{
			System.out.println("the number is three digits");
		}
		else if (num<9999)
		{
			System.out.println("the number is four digits");
		}
		else if (num<99999)
		{
			System.out.println("the number is five digits");
		}
		else
		{
			System.out.println("more than five digits");
		}
}

}
