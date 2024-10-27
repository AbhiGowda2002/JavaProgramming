package com.gentech.programs;

import java.util.Scanner;

public class Conditionaldemo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the char");
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
		{
			System.out.println("The entered char is vowel");
		}
		else 
		{
			System.out.println("The entered char is consonent");
		}
		
		
		
		
		
	}

}
