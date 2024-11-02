package com.gentech.interview;
class Class
{
	public void getaddition(int x,int y)
	{
		int res=x+y;
		System.out.println("The result of "+x + " and " +y + " is :" +res);
	}
	public void getAdditionOfThree(int x,int y,int z)
	{
		int result=x+y+z;
		System.out.println("The result of "+x + " and " +y + " and " +z +" is :"+result);
	}
	public void getSquare(int x)
	{
		int res1=x*x;
		System.out.println(res1);
	}
}

public class MethodOverloading {

	public static void main(String[] args) {
		
		Class cls=new Class();
		cls.getaddition(10, 10);
		System.out.println("----------");
		
		cls.getAdditionOfThree(10, 10, 10);
		System.out.println("-----------");
		
		cls.getSquare(10);
		

	}

}
