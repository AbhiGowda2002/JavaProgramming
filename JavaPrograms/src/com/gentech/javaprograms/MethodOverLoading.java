package com.gentech.javaprograms;
class Human
{
	public void GetHumanName(String name)
	{
		System.out.println(name);
	}
	public void GetHumanName(String lastname,int age)
	{
		System.out.println(lastname);
		System.out.println(age);
	}
	public void GetHumanName(String jobname,int salary,int age)
	{
		System.out.println(jobname);
		System.out.println(age);
		System.out.println(salary);
	}
}

public class MethodOverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human obj=new Human();
		obj.GetHumanName("Abhishek");
		obj.GetHumanName("Abhishek s", 22);
		obj.GetHumanName("Manager", 22, 250000);
			
	}

}
