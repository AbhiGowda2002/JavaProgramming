package com.gentech.array;

public class Array2dAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[][]= {{20,30,40},{10,20,30}};
		int y[][]= {{50,60,70},{80,90,80}};
		int res;
		for (int i=0;i<x.length;i++)
		{
			for(int j=0;j<y[i].length;j++)
			{
				System.out.print(res=x[i][j]+y[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}

	}

}
