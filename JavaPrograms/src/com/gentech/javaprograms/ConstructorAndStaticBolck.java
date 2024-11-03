package com.gentech.javaprograms;
class Vss
{
	String branch;
	Vss(String Schoolname,String Branch)
	{
		this.branch=Branch;
		System.out.println(Schoolname);
		System.out.println(Branch);
	}
	
	static 
	{
		System.out.println("This is a Static Block");
	}
}

public class ConstructorAndStaticBolck {

	public static void main(String[] args) {
		Vss o=new Vss("Vss Public School","Science");

	}

}
