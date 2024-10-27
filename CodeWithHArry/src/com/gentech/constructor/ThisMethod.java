package com.gentech.constructor;
class customer
{
	String firstname;
	int age;
	customer(String firstname,int age)
	{
		this.firstname=firstname;
		this.age=age;
		System.out.println(firstname);
		System.out.println(age);
	}

void display()
{
	System.out.println(firstname);
	System.out.println(age);
}

public class ThisMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		customer o=new customer("sontosh",22);
		o.display();
		
	}

}
}