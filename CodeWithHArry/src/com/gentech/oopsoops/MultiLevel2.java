package com.gentech.oopsoops;
class Demo1
{   
	void getcityname(String cityname)
	{
		System.out.println("Not a Metrocityname:"+cityname);
	}
}
class Demo2 extends Demo1
{
	void getcityname(String Metrocityname)
	{
		super.getcityname("Chennai");
		System.out.println("It is a Metrocityname:"+Metrocityname);
	}
}
public class MultiLevel2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo2 o=new Demo2();
		o.getcityname("Bangalore");
		
	}
}
