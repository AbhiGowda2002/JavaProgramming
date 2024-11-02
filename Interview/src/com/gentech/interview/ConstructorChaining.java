package com.gentech.interview;
class College
{
	College(String name)
	{
		System.out.println(name);
	}
	College(String Cources,int fees)
	{
		this("Bangalore Institute of Technology");
		System.out.println(Cources);
		System.out.println(fees);
	}
}

public class ConstructorChaining {

	public static void main(String[] args) {
		
		College o=new College("Computers",200000);
	}

}
