package com.gentech.practice.array;

public class numberspresentinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]= {100,200,300,400,500};
		int present=12;
		for(int elements:num)
		{
			if(present==elements)
			{
				System.out.println("The  number is present in the array");
				break;
			}
			else {
				System.out.println("The  number is  not present in the array");
				break;
			}
		}

	}

}
