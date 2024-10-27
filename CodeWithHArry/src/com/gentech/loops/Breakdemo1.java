package com.gentech.loops;

public class Breakdemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=15;i++)
		{
			System.out.println(i);
			System.out.println("java is greate");
			if(i==5)
			{
				System.out.println("Ending the loop");
				break;
			}
		}
	}

}
