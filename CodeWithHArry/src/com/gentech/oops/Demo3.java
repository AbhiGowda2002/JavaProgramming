package com.gentech.oops;
class Students
{
	static String name;
	static int age;
	
     static void getsum(int x,int y)
	{
		int res=x=y;
		System.out.println(res);
	}
}

public class Demo3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students.name="Abhishek";
		Students.age=22;
		
		Students.getsum(20, 20);
		
		Students.name="Abhishek";
		Students.age=22;
	}

}
