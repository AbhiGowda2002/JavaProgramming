package com.gentech.staticmethods;
class Employee
{
	static String ename;
	static int sal;
	
	static {
		ename="harsha";
		sal=22000;
	}
	static void showname()
	{
		System.out.println(ename);
	}
	static void showsal()
	{
		System.out.println(sal);
	}
}

public class Staticdemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee.showname();
		Employee.showsal();
	}

}
