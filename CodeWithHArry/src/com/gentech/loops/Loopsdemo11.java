package com.gentech.loops;

import java.util.Scanner;

public class Loopsdemo11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the table number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(num+"X"+i+"="+(num*i));
		}
		System.out.println("thank you");
	}

}
