package com.gentech.array;

import java.util.Scanner;

public class ArrayDemo11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the array elements");
		Scanner sc =new Scanner(System.in);
		int row=sc.nextInt();
		int col=sc.nextInt();
		
		int num[][]=new int [row][col];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				num[row][col]=sc.nextInt();
			}
		}
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(num[row][col]);
				System.out.print(" ");
			}
			System.out.println();
	}

	}
}
