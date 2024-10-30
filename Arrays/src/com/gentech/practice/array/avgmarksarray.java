package com.gentech.practice.array;

public class avgmarksarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks[]= {50,60,70,80,90,100};
		int sum=0;
		for(int elements:marks)
		{
			sum=sum+elements;
		}
		System.out.println("The average marks of the physics is : "+sum/marks.length);
	}

}
