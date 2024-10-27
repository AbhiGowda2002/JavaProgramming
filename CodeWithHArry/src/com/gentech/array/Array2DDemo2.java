package com.gentech.array;

public class Array2DDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{20,30,40},{40,50,60},{20,30,40}};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}
