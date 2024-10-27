package com.gentech.programs;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("What is Your name");
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		System.out.println("Welcome "+name+" Have a good day");
		System.out.println("-----------------");
		
		System.out.println("Enter the number");
		Scanner bc=new Scanner(System.in);
		System.out.println(bc.hasNextInt());
		System.out.println("-----------------");
		
		System.out.println("Enter the number");
		Scanner wc=new Scanner(System.in);
		int a=wc.nextInt();
		System.out.println(a>8);
		System.out.println("-----------------");
		
		String name1="Abhishek";
		name1=name1.toLowerCase();
		System.out.println(name1);
		
		
	}

}
