package com.gentech.javaprograms;
class Star
{
	static int age;
	static String  name;
	static char lastname;
	static float salary;
}

public class StaticVariable1 {

	public static void main(String[] args) {
		Star s=new Star();
		int v1=s.age=22;
		System.out.println(v1);
		
		String str=s.name="Abhishek";
		System.out.println(str);
		
		char ch=s.lastname='s';
		System.out.println(ch);
		
		float sal=s.salary=20000.0f;
		System.out.println(sal);
		

	}

}
