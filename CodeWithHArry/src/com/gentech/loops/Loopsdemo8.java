package com.gentech.loops;

public class Loopsdemo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=1;i<=100;i++)
		{
			if(i%3==0)
			{
				count=count+1;
			}
		}
		System.out.println(count);
	}

}
