package com.gentech.programs;

import java.util.Scanner;

public class ConditionalSwitch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the marks");
		Scanner sc=new Scanner(System.in);
		int marks=sc.nextInt();
		switch(marks)
		{
		case 70:
			System.out.println("FCD");
			break;
		case 60:case 61:case 62:case 63:case 64:case 65:case 66:case 67:case 68:case 69:
			System.out.println("Result is Firstclass");
		case 50:case 51:case 52:case 53:case 54:case 55:case 56:case 57:case 58:case 59:
			System.out.println("result is Secondclass");
			break;
		default:
			System.out.println("result is just pass");
		}
		
	}

}
