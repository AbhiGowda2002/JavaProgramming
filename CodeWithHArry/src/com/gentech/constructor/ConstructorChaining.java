package com.gentech.constructor;

class Worker
{
	Worker(String name)
	{
		System.out.println(name);
	}
	Worker(int salary)
	{
		this("Abhishek");
		System.out.println(salary);
	}
}
public class ConstructorChaining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Worker o1=new Worker(25000);
	}

}
