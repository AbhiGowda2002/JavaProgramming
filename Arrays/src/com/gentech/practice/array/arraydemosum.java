package com.gentech.practice.array;

public class arraydemosum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The sum of marks is");
		float marks[]= {100.0f,99.1f,88.76f,88.12f,54.12f};
		float sum=0;
		for(float elements:marks)
		{
			sum=sum+elements;
		}
		System.out.println(sum);
		
		System.out.println("The sum of marks2 is");
		
		float marks2[]= {77.21f,77.11f,88.26f,88.12f,99.41f};
		float sum1=0;
		for(float elements:marks2)
		{
			sum1=sum1+elements;
		}
		System.out.println(sum1);
		
	}

}
