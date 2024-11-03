package com.gentech.javaprograms;
class Abhi
{
	 static String name;
	 
	 public static void getaddition(int x,int y)
	 {
		 int res=x+y;
		 System.out.println(res);
	 }
	 public static void getmultiplication(int x,int y)
	 {
		 int res= x*y;
		 System.out.println(res);
	 }
}

public class StaticMembers {

	public static void main(String[] args) {
		String name=Abhi.name="Abhishek";
		System.out.println(name);
		
		Abhi.getaddition(10, 10);
		
		Abhi.getmultiplication(10,10);

	}

}
