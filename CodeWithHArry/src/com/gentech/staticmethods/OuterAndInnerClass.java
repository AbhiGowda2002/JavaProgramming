package com.gentech.staticmethods;
class Outer
{
	String firstname;
	Inner inner =new  Inner();
	void showage()
	{
		inner.age=22;
		System.out.println("age is :"+inner.age);
	}
	class Inner
	{
		int age;
		void showfn()
		{
			firstname="abhishek";
			System.out.println("The name is :"+firstname);
		}
	}
}

public class OuterAndInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer outer=new Outer();
		outer.showage();
		
		outer.inner.showfn();
	}

}
