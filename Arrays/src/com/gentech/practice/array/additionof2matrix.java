package com.gentech.practice.array;

public class additionof2matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mat1[][]= {{1,2,3},
		               {4,5,6}};
		int mat2[][]= {{7,8,9},
				      {10,11,12}};
		int res[][]=  {{0,0,0}, 
				      {0,0,0}};
		for(int i=0;i<mat1.length;i++)
		{
			for(int j=0;j<mat2[i].length;j++)
			{
				res[i][j]=mat1[i][j]+mat2[i][j];
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}
