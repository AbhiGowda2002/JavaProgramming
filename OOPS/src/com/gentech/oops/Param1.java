package com.gentech.oops;
class Emp
{
	Emp(String name,int age)
	{
		System.out.println(name);
		System.out.println(age);
	}
}
class Emp1 extends Emp
{
	String Deptname;
	Emp1()
	{
		super("Abhishek",22);
		Deptname="Developer";
		System.out.println(Deptname);
		
	}
}

public class Param1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp1 employee =new Emp1();
	}

}
