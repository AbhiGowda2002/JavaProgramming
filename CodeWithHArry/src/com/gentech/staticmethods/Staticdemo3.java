package com.gentech.staticmethods;
class StaticMembors
{
	static String subject;
	static void addition(int x,int y)
	{
		int res=x+y;
		System.out.println(res);
	}
}
class subject
{
	static String Subname;
	static int id;
	static void subtraction(int x,int y)
	{
		int res=x-y;
		System.out.println(res);
	}
}
public class Staticdemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticMembors.subject="maths";
		System.out.println(StaticMembors.subject);
		StaticMembors.addition(20,20);
		System.out.println("-------------------");
		//2
		subject.Subname="Kannada";
		System.out.println(subject.Subname);
		subject.id=2011;
		System.out.println(subject.id);
		subject.subtraction(20, 10);
		
	}

}
