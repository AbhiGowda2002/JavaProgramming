package com.gentech.interview;
class Animalss
{
	String name;
	String type;
	
	Animalss()
	{
		this(" "," ");
	}
	Animalss(String name, String type)
	{
		this.name=name;
		this.type=type;
		
		System.out.println(name);
		System.out.println(type);
	}
}

public class ThisOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
	Animalss obj=new Animalss("Tiger","Carnivorous");
	}

}
