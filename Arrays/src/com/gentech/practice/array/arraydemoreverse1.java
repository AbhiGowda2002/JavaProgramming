package com.gentech.practice.array;

public class arraydemoreverse1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks []=new int[7]; 
		marks[0]=90;
		marks[1]=100;
		marks[2]=90;
		marks[3]=80;
		marks[4]=70;
		marks[5]=77;
		marks[6]=88;
		for(int i=marks.length-1;i>=0;i--)
		{
			System.out.println(marks[i]);
		}
		for(int element:marks)
		{
			System.out.println(element);
		}
	}

}
