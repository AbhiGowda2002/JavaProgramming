package com.gentech.staticmethods;
class Methods2
{
	
	Methods2()
	{
		 String name="Abhishek";
		 int age=22;
		System.out.println(name);
		System.out.println(age);
	}
}
class Methods3
{
	
	Methods3(String firstname,int age)
	{
		System.out.println(firstname);
		System.out.println(age);
		
	}
}
public class ConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methods2 o=new Methods2();
		Methods3 o1=new Methods3("Abhishek",22);
	}

}
