package com.gentech.javaprograms;
class Outterr
{
	int age;
	Innerr inner=new Innerr();
	void Showname()
	{
		inner.name="Abhishek";
		System.out.println(inner.name);
	}
	class Innerr
	{
		String name;
		void Showage()
		{
			age=22;
			System.out.println(age);
		}
	}
}

public class OuterAndInnerClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outterr out=new Outterr();
		out.Showname();
		out.inner.Showage();
	}

}
